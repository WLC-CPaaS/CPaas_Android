# CallRecordingApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDRecordingGet**](CallRecordingApi.md#v1AccountAccountIDRecordingGet) | **GET** /v1/account/{accountID}/recording | Get Account Call Recording
[**v1AccountAccountIDRecordingRecordingIDDelete**](CallRecordingApi.md#v1AccountAccountIDRecordingRecordingIDDelete) | **DELETE** /v1/account/{accountID}/recording/{recordingID} | Delete Call Recording
[**v1AccountAccountIDRecordingRecordingIDGet**](CallRecordingApi.md#v1AccountAccountIDRecordingRecordingIDGet) | **GET** /v1/account/{accountID}/recording/{recordingID} | Get Call Recording Details
[**v1AccountAccountIDUserUserIDRecordingGet**](CallRecordingApi.md#v1AccountAccountIDUserUserIDRecordingGet) | **GET** /v1/account/{accountID}/user/{userID}/recording | Get User Call Recording



## v1AccountAccountIDRecordingGet

> ServiceDocsCallRecordingGetAll v1AccountAccountIDRecordingGet(accountID)

Get Account Call Recording

Obtain a list of the call recordings within an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallRecordingApi;

CallRecordingApi apiInstance = new CallRecordingApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsCallRecordingGetAll result = apiInstance.v1AccountAccountIDRecordingGet(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallRecordingApi#v1AccountAccountIDRecordingGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsCallRecordingGetAll**](ServiceDocsCallRecordingGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDRecordingRecordingIDDelete

> ServiceDocsCallRecordingGetSingle v1AccountAccountIDRecordingRecordingIDDelete(accountID, recordingID)

Delete Call Recording

Delete a single call recording from an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallRecordingApi;

CallRecordingApi apiInstance = new CallRecordingApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String recordingID = null; // String | Recording ID, 39 (yyyymm-<32 id>)
try {
    ServiceDocsCallRecordingGetSingle result = apiInstance.v1AccountAccountIDRecordingRecordingIDDelete(accountID, recordingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallRecordingApi#v1AccountAccountIDRecordingRecordingIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **recordingID** | **String**| Recording ID, 39 (yyyymm-&lt;32 id&gt;) | [default to null]

### Return type

[**ServiceDocsCallRecordingGetSingle**](ServiceDocsCallRecordingGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountIDRecordingRecordingIDGet

> ServiceDocsCallRecordingGetSingle v1AccountAccountIDRecordingRecordingIDGet(accountID, recordingID)

Get Call Recording Details

Access details for each recorded call in an account (e.g., duration, names and numbers of call participants, etc.).

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallRecordingApi;

CallRecordingApi apiInstance = new CallRecordingApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String recordingID = null; // String | Recording ID, 39 (yyyymm-<32 id>)
try {
    ServiceDocsCallRecordingGetSingle result = apiInstance.v1AccountAccountIDRecordingRecordingIDGet(accountID, recordingID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallRecordingApi#v1AccountAccountIDRecordingRecordingIDGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **recordingID** | **String**| Recording ID, 39 (yyyymm-&lt;32 id&gt;) | [default to null]

### Return type

[**ServiceDocsCallRecordingGetSingle**](ServiceDocsCallRecordingGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, audio/mp3, audio/mpeg, audio/mpeg3, audio/x-wav, audio/wav


## v1AccountAccountIDUserUserIDRecordingGet

> ServiceDocsCallRecordingGetAll v1AccountAccountIDUserUserIDRecordingGet(accountID, userID)

Get User Call Recording

Retrieve a list of call recordings for a user within an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallRecordingApi;

CallRecordingApi apiInstance = new CallRecordingApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String userID = null; // String | User ID, 32 alpha numeric
try {
    ServiceDocsCallRecordingGetAll result = apiInstance.v1AccountAccountIDUserUserIDRecordingGet(accountID, userID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallRecordingApi#v1AccountAccountIDUserUserIDRecordingGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **userID** | **String**| User ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsCallRecordingGetAll**](ServiceDocsCallRecordingGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

