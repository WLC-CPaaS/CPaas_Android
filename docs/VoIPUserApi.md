# VoIPUserApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountidUserGet**](VoIPUserApi.md#v1AccountAccountidUserGet) | **GET** /v1/account/{accountid}/user | Get User List
[**v1AccountAccountidUserPost**](VoIPUserApi.md#v1AccountAccountidUserPost) | **POST** /v1/account/{accountid}/user | Create User
[**v1AccountAccountidUserUseridDelete**](VoIPUserApi.md#v1AccountAccountidUserUseridDelete) | **DELETE** /v1/account/{accountid}/user/{userid} | Delete User
[**v1AccountAccountidUserUseridGet**](VoIPUserApi.md#v1AccountAccountidUserUseridGet) | **GET** /v1/account/{accountid}/user/{userid} | Get User Details
[**v1AccountAccountidUserUseridPut**](VoIPUserApi.md#v1AccountAccountidUserUseridPut) | **PUT** /v1/account/{accountid}/user/{userid} | Update User
[**v1AccountAccountidUserUseridUserauthPost**](VoIPUserApi.md#v1AccountAccountidUserUseridUserauthPost) | **POST** /v1/account/{accountid}/user/{userid}/userauth | Impersonate a User



## v1AccountAccountidUserGet

> ServiceDocsUserGetAll v1AccountAccountidUserGet(accountid, startKey, pageSize)

Get User List

Get a list of all VoIP users that includes first and last names, email addresses, extensions, and account statuses.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoIPUserApi;

VoIPUserApi apiInstance = new VoIPUserApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsUserGetAll result = apiInstance.v1AccountAccountidUserGet(accountid, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoIPUserApi#v1AccountAccountidUserGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **startKey** | **String**| start_key for pagination that was returned as next_start_key from your previous call | [optional] [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]

### Return type

[**ServiceDocsUserGetAll**](ServiceDocsUserGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidUserPost

> ServiceDocsUserGetSingle v1AccountAccountidUserPost(accountid, user)

Create User

Add new users to the account. When a user is added, the system generates their unique 32 alpha numeric ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoIPUserApi;

VoIPUserApi apiInstance = new VoIPUserApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceVOIPUserAdd2 user = new ServiceVOIPUserAdd2(); // ServiceVOIPUserAdd2 | user fields
try {
    ServiceDocsUserGetSingle result = apiInstance.v1AccountAccountidUserPost(accountid, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoIPUserApi#v1AccountAccountidUserPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **user** | [**ServiceVOIPUserAdd2**](ServiceVOIPUserAdd2.md)| user fields |

### Return type

[**ServiceDocsUserGetSingle**](ServiceDocsUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidUserUseridDelete

> ServiceDocsUserGetSingle v1AccountAccountidUserUseridDelete(accountid, userid)

Delete User

Delete VoIP user access to maintain the security of your accounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoIPUserApi;

VoIPUserApi apiInstance = new VoIPUserApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String userid = null; // String | User ID, 32 alpha numeric
try {
    ServiceDocsUserGetSingle result = apiInstance.v1AccountAccountidUserUseridDelete(accountid, userid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoIPUserApi#v1AccountAccountidUserUseridDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userid** | **String**| User ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsUserGetSingle**](ServiceDocsUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidUserUseridGet

> ServiceDocsUserGetSingle v1AccountAccountidUserUseridGet(accountid, userid)

Get User Details

View specific user details.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoIPUserApi;

VoIPUserApi apiInstance = new VoIPUserApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String userid = null; // String | User ID, 32 alpha numeric
try {
    ServiceDocsUserGetSingle result = apiInstance.v1AccountAccountidUserUseridGet(accountid, userid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoIPUserApi#v1AccountAccountidUserUseridGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userid** | **String**| User ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsUserGetSingle**](ServiceDocsUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidUserUseridPut

> ServiceDocsUserGetSingle v1AccountAccountidUserUseridPut(accountid, userid, user)

Update User

Keep user information current. Modify the first and last name, extension, and other pertinent information.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoIPUserApi;

VoIPUserApi apiInstance = new VoIPUserApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String userid = null; // String | User ID, 32 alpha numeric
ServiceVOIPUserAdd2 user = new ServiceVOIPUserAdd2(); // ServiceVOIPUserAdd2 | user fields
try {
    ServiceDocsUserGetSingle result = apiInstance.v1AccountAccountidUserUseridPut(accountid, userid, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoIPUserApi#v1AccountAccountidUserUseridPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userid** | **String**| User ID, 32 alpha numeric | [default to null]
 **user** | [**ServiceVOIPUserAdd2**](ServiceVOIPUserAdd2.md)| user fields |

### Return type

[**ServiceDocsUserGetSingle**](ServiceDocsUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidUserUseridUserauthPost

> ServiceDocsImpersonateUserGetSingle v1AccountAccountidUserUseridUserauthPost(accountid, userid, user)

Impersonate a User

Impersonate as another user if you have access to admin.

### Example

```java
// Import classes:
//import org.openapitools.client.api.VoIPUserApi;

VoIPUserApi apiInstance = new VoIPUserApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String userid = null; // String | User ID, 32 alpha numeric
ServiceVOIPImpersonateUser user = new ServiceVOIPImpersonateUser(); // ServiceVOIPImpersonateUser | Payload for impersonate a user
try {
    ServiceDocsImpersonateUserGetSingle result = apiInstance.v1AccountAccountidUserUseridUserauthPost(accountid, userid, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoIPUserApi#v1AccountAccountidUserUseridUserauthPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userid** | **String**| User ID, 32 alpha numeric | [default to null]
 **user** | [**ServiceVOIPImpersonateUser**](ServiceVOIPImpersonateUser.md)| Payload for impersonate a user |

### Return type

[**ServiceDocsImpersonateUserGetSingle**](ServiceDocsImpersonateUserGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

