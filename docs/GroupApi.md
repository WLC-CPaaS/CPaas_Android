# GroupApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDGroupGet**](GroupApi.md#v1AccountAccountIDGroupGet) | **GET** /v1/account/{accountID}/group | Get Group List
[**v1AccountAccountIDGroupGroupIDDelete**](GroupApi.md#v1AccountAccountIDGroupGroupIDDelete) | **DELETE** /v1/account/{accountID}/group/{groupID} | Delete Group
[**v1AccountAccountIDGroupGroupIDGet**](GroupApi.md#v1AccountAccountIDGroupGroupIDGet) | **GET** /v1/account/{accountID}/group/{groupID} | Get Group Details
[**v1AccountAccountIDGroupGroupIDPut**](GroupApi.md#v1AccountAccountIDGroupGroupIDPut) | **PUT** /v1/account/{accountID}/group/{groupID} | Update Group
[**v1AccountAccountIDGroupPost**](GroupApi.md#v1AccountAccountIDGroupPost) | **POST** /v1/account/{accountID}/group | Create Group



## v1AccountAccountIDGroupGet

> ServiceDocGroupGetAll v1AccountAccountIDGroupGet(accountID, startKey, pageSize)

Get Group List

Get a list of groups associated with an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GroupApi;

GroupApi apiInstance = new GroupApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocGroupGetAll result = apiInstance.v1AccountAccountIDGroupGet(accountID, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v1AccountAccountIDGroupGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **startKey** | **String**| start_key for pagination that was returned as next_start_key from your previous call | [optional] [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]

### Return type

[**ServiceDocGroupGetAll**](ServiceDocGroupGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDGroupGroupIDDelete

> ServiceDocGroupGetSingle v1AccountAccountIDGroupGroupIDDelete(accountID, groupID)

Delete Group

Delete a call group in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GroupApi;

GroupApi apiInstance = new GroupApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String groupID = null; // String | group ID, 32 alpha numeric
try {
    ServiceDocGroupGetSingle result = apiInstance.v1AccountAccountIDGroupGroupIDDelete(accountID, groupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v1AccountAccountIDGroupGroupIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **groupID** | **String**| group ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocGroupGetSingle**](ServiceDocGroupGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDGroupGroupIDGet

> ServiceDocGroupGetSingle v1AccountAccountIDGroupGroupIDGet(accountID, groupID)

Get Group Details

Access details about a single group within an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GroupApi;

GroupApi apiInstance = new GroupApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String groupID = null; // String | Group ID, 32 alpha numeric
try {
    ServiceDocGroupGetSingle result = apiInstance.v1AccountAccountIDGroupGroupIDGet(accountID, groupID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v1AccountAccountIDGroupGroupIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **groupID** | **String**| Group ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocGroupGetSingle**](ServiceDocGroupGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDGroupGroupIDPut

> ServiceDocGroupGetSingle v1AccountAccountIDGroupGroupIDPut(accountID, groupID, reqBody)

Update Group

Modify the name, settings and other information for a group within an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GroupApi;

GroupApi apiInstance = new GroupApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String groupID = null; // String | Group ID, 32 alpha numeric
ServiceVOIPGroupAddEdit2 reqBody = new ServiceVOIPGroupAddEdit2(); // ServiceVOIPGroupAddEdit2 | payload fields
try {
    ServiceDocGroupGetSingle result = apiInstance.v1AccountAccountIDGroupGroupIDPut(accountID, groupID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v1AccountAccountIDGroupGroupIDPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **groupID** | **String**| Group ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPGroupAddEdit2**](ServiceVOIPGroupAddEdit2.md)| payload fields |

### Return type

[**ServiceDocGroupGetSingle**](ServiceDocGroupGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDGroupPost

> ServiceDocGroupGetSingle v1AccountAccountIDGroupPost(accountID, group)

Create Group

Provide an additional resource by adding a group list to an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.GroupApi;

GroupApi apiInstance = new GroupApi();
String accountID = null; // String | Account ID
ServiceVOIPGroupAddEdit2 group = new ServiceVOIPGroupAddEdit2(); // ServiceVOIPGroupAddEdit2 | group fields
try {
    ServiceDocGroupGetSingle result = apiInstance.v1AccountAccountIDGroupPost(accountID, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupApi#v1AccountAccountIDGroupPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **group** | [**ServiceVOIPGroupAddEdit2**](ServiceVOIPGroupAddEdit2.md)| group fields |

### Return type

[**ServiceDocGroupGetSingle**](ServiceDocGroupGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

