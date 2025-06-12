# PresenceApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDPresenceExtensionPut**](PresenceApi.md#v1AccountAccountIDPresenceExtensionPut) | **PUT** /v1/account/{accountID}/presence/{extension} | Set/Reset Presence for Extension
[**v1AccountAccountIDPresenceGet**](PresenceApi.md#v1AccountAccountIDPresenceGet) | **GET** /v1/account/{accountID}/presence | Get Presence Details
[**v1AccountAccountIDUserUserIDPresencePut**](PresenceApi.md#v1AccountAccountIDUserUserIDPresencePut) | **PUT** /v1/account/{accountID}/user/{userID}/presence | Set/Reset Presence for User



## v1AccountAccountIDPresenceExtensionPut

> ServiceAPIResponse v1AccountAccountIDPresenceExtensionPut(accountID, extension, reqBody)

Set/Reset Presence for Extension

Set or reset the presence status of an extension.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PresenceApi;

PresenceApi apiInstance = new PresenceApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String extension = null; // String | Extension
ServiceVOIPPresenceSetResetEditData reqBody = new ServiceVOIPPresenceSetResetEditData(); // ServiceVOIPPresenceSetResetEditData | payload fields
try {
    ServiceAPIResponse result = apiInstance.v1AccountAccountIDPresenceExtensionPut(accountID, extension, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#v1AccountAccountIDPresenceExtensionPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **extension** | **String**| Extension | [default to null]
 **reqBody** | [**ServiceVOIPPresenceSetResetEditData**](ServiceVOIPPresenceSetResetEditData.md)| payload fields |

### Return type

[**ServiceAPIResponse**](ServiceAPIResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDPresenceGet

> ServiceDocsPresenceGet v1AccountAccountIDPresenceGet(accountID)

Get Presence Details

Retrieve details of presence subscriptions in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PresenceApi;

PresenceApi apiInstance = new PresenceApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsPresenceGet result = apiInstance.v1AccountAccountIDPresenceGet(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#v1AccountAccountIDPresenceGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsPresenceGet**](ServiceDocsPresenceGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDUserUserIDPresencePut

> ServiceAPIResponse v1AccountAccountIDUserUserIDPresencePut(accountID, userID, reqBody)

Set/Reset Presence for User

Set or reset the presence status of a user within an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.PresenceApi;

PresenceApi apiInstance = new PresenceApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String userID = null; // String | User ID, 32 alpha numeric
ServiceVOIPPresenceSetResetEditData reqBody = new ServiceVOIPPresenceSetResetEditData(); // ServiceVOIPPresenceSetResetEditData | payload fields
try {
    ServiceAPIResponse result = apiInstance.v1AccountAccountIDUserUserIDPresencePut(accountID, userID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenceApi#v1AccountAccountIDUserUserIDPresencePut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userID** | **String**| User ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPPresenceSetResetEditData**](ServiceVOIPPresenceSetResetEditData.md)| payload fields |

### Return type

[**ServiceAPIResponse**](ServiceAPIResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

