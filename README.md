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

## 認証
基本的なサインイン、サインアップ認証はAuthで行います。その他のAPIとは異なり、Auth APIはPOST認証もbearerAuth無しで認証可能です。  
認証の実装はbotapeer-coreで行なっており、[botapeer-core](https://github.com/calmandhelp/botapeer-core)をご参照いただければと存じます。
