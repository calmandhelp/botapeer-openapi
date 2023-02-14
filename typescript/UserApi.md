# .UserApi

All URIs are relative to *http://localhost:8081/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUser**](UserApi.md#deleteUser) | **DELETE** /users/{userId} | 
[**findUser**](UserApi.md#findUser) | **GET** /users/{userId} | 
[**getUsersOrGetUserByName**](UserApi.md#getUsersOrGetUserByName) | **GET** /users | 
[**updateUser**](UserApi.md#updateUser) | **PATCH** /users/{userId} | 


# **deleteUser**
> User deleteUser()

任意のUserを削除

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiDeleteUserRequest = {
  // string | ユーザーID
  userId: "1",
};

apiInstance.deleteUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | ユーザーID | defaults to undefined


### Return type

**User**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ok |  -  |
**401** | 401(Unauthorized) |  * http_status - HTTPステータス <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **findUser**
> User findUser()

任意のUserを取得

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiFindUserRequest = {
  // string | ユーザーID
  userId: "1",
};

apiInstance.findUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | ユーザーID | defaults to undefined


### Return type

**User**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ok |  -  |
**404** | 404(User Not Found) |  -  |
**405** | 405(Validation exception) |  * http_status - HTTPステータス <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getUsersOrGetUserByName**
> Array<User> getUsersOrGetUserByName()

User一覧もしくは名前からユーザーを取得

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiGetUsersOrGetUserByNameRequest = {
  // string | ユーザー名 (optional)
  username: "taro",
};

apiInstance.getUsersOrGetUserByName(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | [**string**] | ユーザー名 | (optional) defaults to undefined


### Return type

**Array<User>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ok |  -  |
**404** | 404(User Not Found) |  -  |
**405** | 405(Validation exception) |  * http_status - HTTPステータス <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateUser**
> User updateUser()

任意のUserを更新

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UserApi(configuration);

let body:.UserApiUpdateUserRequest = {
  // string | ユーザーID
  userId: "1",
  // UpdateUserFormData (optional)
  formData: null,
  // HttpFile (optional)
  profileImage: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
  // HttpFile (optional)
  coverImage: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.updateUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | ユーザーID | defaults to undefined
 **formData** | **UpdateUserFormData** |  | (optional) defaults to undefined
 **profileImage** | [**HttpFile**] |  | (optional) defaults to undefined
 **coverImage** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

**User**

### Authorization

[bearerAuth](README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ok |  -  |
**401** | 401(Unauthorized) |  -  |
**405** | 405(Validation exception) |  * http_status - HTTPステータス <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


