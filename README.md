# botapeer-openapi
botapeerのバックエンドAPIの仕様を記述したリポジトリです。
急がれている方は[openapi.yml](https://github.com/calmandhelp/botapeer-openapi/blob/main/openapi.yml)の記述を[swagger-viwer](https://chrome.google.com/webstore/detail/swagger-viewer/nfmkaonpdmaglhjjlggfhlndofdldfag?hl=ja)のchrome拡張機能利用してご覧いただくか、
swaggerエディタの[petstore](https://editor.swagger.io/)にペーストしていただいて確認していただくのが早いです。 

## APIの概要
### User  
- サービスを利用するユーザーを操作するAPIです。
- ユーザーはplant_recordsという植物記録を持つことができます。
- ユーザーの作成処理はAuth APIで行います。
- 更新、削除には認証が必要です。  
### Auth
- 認証の役割を持つAPIです。
- サインアップ、サインイン共に認証を行わずに実行できます。  
### PlantRecord（植物記録）
- 植物記録の操作を行うAPIです。
- ユーザーIDや植物記録IDから検索できます。  
- 作成はユーザーが行います。（botapeer-coreでトークン認証情報からユーザーIDを取得し、ユーザーの確認を行います。）  
### Post（記事）
- 記事に関する操作を行うAPIです。
- 構造としては、植物記録が複数の記事を持ちます。
- 植物記録がないと記事は存在できません。
- 記事にはいいねすることができます。  
### Place
- 植物を置く場所を返すAPIです。
- 例: ベランダ、キッチンなど  

## スキーマ駆動開発
フロントエンド、バックエンドはスキーマ駆動の開発をしております。このリポジトリのopenapi.ymlで定義されたスキーマはGithub Actionsで自動生成されます。  
![スクリーンショット 2023-03-31 0 47 46](https://user-images.githubusercontent.com/39892315/228892308-eba92529-14b6-4cb5-b811-403bd17363ac.png)  
生成されたコードは[このリポジトリのGitHub Packages](https://github.com/calmandhelp/botapeer-openapi/packages/1791567)で管理されます。  

### バックエンド利用時
botapeer-core（springフレームワーク）で利用する際は以下の様にしてpom.xmlから取り込みます。
```pom.xml
<dependency>
  <groupId>com.openapi.botapeer</groupId>
  <artifactId>botapeer-openapi</artifactId>
  <version>1.5.5</version>
</dependency>

```  
また、Controllerの実装では以下のように生成されたインターフェースをimplementsすることでAPIを実装します。
このようにすることで、不足しているAPI実装があった場合にコンパイルエラーとなるため、不足なくAPIを実装することができます。
```java
public class UserController implements UsersApi {
```  
同時にモデルの生成もされているされているため、例えば以下のようなUserResponseといったモデルに関しても自動生成された型を利用することができ、APIの仕様書と実装の乖離を防ぐことができます。
```java
public ResponseEntity<UserResponse> findUserById(@PathVariable String userId) {
  Optional<UserResponse> u = userUsecase.findById(userId);
  return new ResponseEntity<>(u.get(), HttpStatus.OK);
}
```

### フロントエンド利用時
botapeer-front（フロントエンド）で利用する際はsubmoduleからモデルとapiを読み込みます。
```typescript
import { UserResponse, UserApi, ErrorResponse } from 'botapeer-openapi/typescript-axios';

const userApi = new UserApi();
```
呼び出しには自動生成されたメソッドを利用できます。
```
const response  = await userApi.getUsersOrGetUserByName(name);
```

これにより、フロントエンドとバックエンドの実装を便利に行うことができます。  

また、実際の[workflow](https://github.com/calmandhelp/botapeer-openapi/tree/main/.github/workflows)をご確認いただくとわかりますが、
mainブランチマージの際にもtypescriptのコードを生成しております。これはバックエンドのurlが異なるためにmainブランチにマージする際には再度コードを生成して、クライアントから見たapiのサーバーURLを変更しなければならないためです。（バックエンドの場合は同様のモデルを使用するためspringのコードは生成は行わない）
このように開発環境、本番環境と異なる環境に配慮してworkflowを設計する必要があります。

## 認証
基本的なサインイン、サインアップ認証はAuthで行います。その他のAPIとは異なり、Auth APIはPOST認証もbearerAuth無しで認証可能です。  
認証の実装はbotapeer-coreで行なっており、[botapeer-core](https://github.com/calmandhelp/botapeer-core)をご参照いただければと存じます。
