# ProvisionApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountIDProvisionFilenameGet**](ProvisionApi.md#v1AccountAccountIDProvisionFilenameGet) | **GET** /v1/account/{accountID}/provision/{filename} | 



## v1AccountAccountIDProvisionFilenameGet

> File v1AccountAccountIDProvisionFilenameGet(accountID, filename)



Retrieve the configuration details (e.g., settings and parameters) for a device.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisionApi;

ProvisionApi apiInstance = new ProvisionApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String filename = null; // String | Name of config file
try {
    File result = apiInstance.v1AccountAccountIDProvisionFilenameGet(accountID, filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisionApi#v1AccountAccountIDProvisionFilenameGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **filename** | **String**| Name of config file | [default to null]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

