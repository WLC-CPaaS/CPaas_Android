# MetaflowApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDDeviceDeviceIDMetaflowDelete**](MetaflowApi.md#v1AccountAccountIDDeviceDeviceIDMetaflowDelete) | **DELETE** /v1/account/{accountID}/device/{deviceID}/metaflow | Delete Device Metaflow
[**v1AccountAccountIDDeviceDeviceIDMetaflowGet**](MetaflowApi.md#v1AccountAccountIDDeviceDeviceIDMetaflowGet) | **GET** /v1/account/{accountID}/device/{deviceID}/metaflow | Get Device Metaflow List
[**v1AccountAccountIDDeviceDeviceIDMetaflowPost**](MetaflowApi.md#v1AccountAccountIDDeviceDeviceIDMetaflowPost) | **POST** /v1/account/{accountID}/device/{deviceID}/metaflow | Create Device Metaflow
[**v1AccountAccountIDMetaflowDelete**](MetaflowApi.md#v1AccountAccountIDMetaflowDelete) | **DELETE** /v1/account/{accountID}/metaflow | Delete Account Metaflow
[**v1AccountAccountIDMetaflowGet**](MetaflowApi.md#v1AccountAccountIDMetaflowGet) | **GET** /v1/account/{accountID}/metaflow | Get Account Metaflow List
[**v1AccountAccountIDMetaflowPost**](MetaflowApi.md#v1AccountAccountIDMetaflowPost) | **POST** /v1/account/{accountID}/metaflow | Create Account Metaflow
[**v1AccountAccountIDUserUserIDMetaflowDelete**](MetaflowApi.md#v1AccountAccountIDUserUserIDMetaflowDelete) | **DELETE** /v1/account/{accountID}/user/{userID}/metaflow | Delete User Metaflow
[**v1AccountAccountIDUserUserIDMetaflowGet**](MetaflowApi.md#v1AccountAccountIDUserUserIDMetaflowGet) | **GET** /v1/account/{accountID}/user/{userID}/metaflow | Get User Metaflow List
[**v1AccountAccountIDUserUserIDMetaflowPost**](MetaflowApi.md#v1AccountAccountIDUserUserIDMetaflowPost) | **POST** /v1/account/{accountID}/user/{userID}/metaflow | Create User Metaflow



## v1AccountAccountIDDeviceDeviceIDMetaflowDelete

> ServiceDocsMetaflowGet v1AccountAccountIDDeviceDeviceIDMetaflowDelete(accountID, deviceID)

Delete Device Metaflow

Delete all metaflows associated with a device.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String deviceID = null; // String | Device ID, 32 alpha numeric
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDDeviceDeviceIDMetaflowDelete(accountID, deviceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDDeviceDeviceIDMetaflowDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceID** | **String**| Device ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDDeviceDeviceIDMetaflowGet

> ServiceDocsMetaflowGet v1AccountAccountIDDeviceDeviceIDMetaflowGet(accountID, deviceID)

Get Device Metaflow List

Get the list of metaflows for a device.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String deviceID = null; // String | Device ID, 32 alpha numeric
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDDeviceDeviceIDMetaflowGet(accountID, deviceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDDeviceDeviceIDMetaflowGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceID** | **String**| Device ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDDeviceDeviceIDMetaflowPost

> ServiceDocsMetaflowGet v1AccountAccountIDDeviceDeviceIDMetaflowPost(accountID, deviceID, reqBody)

Create Device Metaflow

Create a metaflow or multiple metaflows for a device.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String deviceID = null; // String | Device ID, 32 alpha numeric
ServiceVOIPMetaflowAddData reqBody = new ServiceVOIPMetaflowAddData(); // ServiceVOIPMetaflowAddData | payload fields
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDDeviceDeviceIDMetaflowPost(accountID, deviceID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDDeviceDeviceIDMetaflowPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceID** | **String**| Device ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPMetaflowAddData**](ServiceVOIPMetaflowAddData.md)| payload fields |

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDMetaflowDelete

> ServiceDocsMetaflowGet v1AccountAccountIDMetaflowDelete(accountID)

Delete Account Metaflow

Remove all metaflows from an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDMetaflowDelete(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDMetaflowDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDMetaflowGet

> ServiceDocsMetaflowGet v1AccountAccountIDMetaflowGet(accountID)

Get Account Metaflow List

Get an account&#39;s metaflow list.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDMetaflowGet(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDMetaflowGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDMetaflowPost

> ServiceDocsMetaflowGet v1AccountAccountIDMetaflowPost(accountID, metaflow)

Create Account Metaflow

Generate a metaflow for an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID
ServiceVOIPMetaflowAddData metaflow = new ServiceVOIPMetaflowAddData(); // ServiceVOIPMetaflowAddData | Metaflow fields
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDMetaflowPost(accountID, metaflow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDMetaflowPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID | [default to null]
 **metaflow** | [**ServiceVOIPMetaflowAddData**](ServiceVOIPMetaflowAddData.md)| Metaflow fields |

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountIDUserUserIDMetaflowDelete

> ServiceDocsMetaflowGet v1AccountAccountIDUserUserIDMetaflowDelete(accountID, userID)

Delete User Metaflow

Delete all metaflows associated with a user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String userID = null; // String | user ID, 32 alpha numeric
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDUserUserIDMetaflowDelete(accountID, userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDUserUserIDMetaflowDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userID** | **String**| user ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDUserUserIDMetaflowGet

> ServiceDocsMetaflowGet v1AccountAccountIDUserUserIDMetaflowGet(accountID, userID)

Get User Metaflow List

Get the list of metaflows for a user.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String userID = null; // String | user ID, 32 alpha numeric
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDUserUserIDMetaflowGet(accountID, userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDUserUserIDMetaflowGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userID** | **String**| user ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDUserUserIDMetaflowPost

> ServiceDocsMetaflowGet v1AccountAccountIDUserUserIDMetaflowPost(accountID, userID, reqBody)

Create User Metaflow

Add a metaflow or multiple metaflows for a user in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MetaflowApi;

MetaflowApi apiInstance = new MetaflowApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String userID = null; // String | user ID, 32 alpha numeric
ServiceVOIPMetaflowAddData reqBody = new ServiceVOIPMetaflowAddData(); // ServiceVOIPMetaflowAddData | payload fields
try {
    ServiceDocsMetaflowGet result = apiInstance.v1AccountAccountIDUserUserIDMetaflowPost(accountID, userID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaflowApi#v1AccountAccountIDUserUserIDMetaflowPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userID** | **String**| user ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceVOIPMetaflowAddData**](ServiceVOIPMetaflowAddData.md)| payload fields |

### Return type

[**ServiceDocsMetaflowGet**](ServiceDocsMetaflowGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

