# CallParkApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDParkedcallGet**](CallParkApi.md#v1AccountAccountIDParkedcallGet) | **GET** /v1/account/{accountID}/parkedcall | Get Call Park List



## v1AccountAccountIDParkedcallGet

> ServiceDocsParkedcallGet v1AccountAccountIDParkedcallGet(accountID)

Get Call Park List

Retrieve a list of calls parked on hold in a numbered slot.

### Example

```java
// Import classes:
//import org.openapitools.client.api.CallParkApi;

CallParkApi apiInstance = new CallParkApi();
String accountID = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsParkedcallGet result = apiInstance.v1AccountAccountIDParkedcallGet(accountID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CallParkApi#v1AccountAccountIDParkedcallGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsParkedcallGet**](ServiceDocsParkedcallGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

