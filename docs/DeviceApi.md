# DeviceApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountidDeviceDeviceidDelete**](DeviceApi.md#v1AccountAccountidDeviceDeviceidDelete) | **DELETE** /v1/account/{accountid}/device/{deviceid} | Delete Device
[**v1AccountAccountidDeviceDeviceidGet**](DeviceApi.md#v1AccountAccountidDeviceDeviceidGet) | **GET** /v1/account/{accountid}/device/{deviceid} | Get Device Details
[**v1AccountAccountidDeviceDeviceidPut**](DeviceApi.md#v1AccountAccountidDeviceDeviceidPut) | **PUT** /v1/account/{accountid}/device/{deviceid} | Update Device
[**v1AccountAccountidDeviceDeviceidRebootPost**](DeviceApi.md#v1AccountAccountidDeviceDeviceidRebootPost) | **POST** /v1/account/{accountid}/device/{deviceid}/reboot | Reboot Device
[**v1AccountAccountidDeviceGet**](DeviceApi.md#v1AccountAccountidDeviceGet) | **GET** /v1/account/{accountid}/device | Get Device List
[**v1AccountAccountidDevicePost**](DeviceApi.md#v1AccountAccountidDevicePost) | **POST** /v1/account/{accountid}/device | Create Device
[**v1AccountAccountidDeviceStatusGet**](DeviceApi.md#v1AccountAccountidDeviceStatusGet) | **GET** /v1/account/{accountid}/device/status | Get Device Status



## v1AccountAccountidDeviceDeviceidDelete

> ServiceDocsDeviceGetSingle v1AccountAccountidDeviceDeviceidDelete(accountid, deviceid)

Delete Device

Remove one device from a CPaaS account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String deviceid = null; // String | Device ID, 32 alpha numeric
try {
    ServiceDocsDeviceGetSingle result = apiInstance.v1AccountAccountidDeviceDeviceidDelete(accountid, deviceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDeviceDeviceidDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceid** | **String**| Device ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsDeviceGetSingle**](ServiceDocsDeviceGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDeviceDeviceidGet

> ServiceDocsDeviceGetSingle v1AccountAccountidDeviceDeviceidGet(accountid, deviceid)

Get Device Details

Permit a user to view specific device details.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String deviceid = null; // String | Device ID, 32 alpha numeric
try {
    ServiceDocsDeviceGetSingle result = apiInstance.v1AccountAccountidDeviceDeviceidGet(accountid, deviceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDeviceDeviceidGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceid** | **String**| Device ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsDeviceGetSingle**](ServiceDocsDeviceGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDeviceDeviceidPut

> ServiceDocsDeviceGetSingle v1AccountAccountidDeviceDeviceidPut(accountid, deviceid, device)

Update Device

Edit specifics about the device, such as the device type, name, and owner.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String deviceid = null; // String | Device ID, 32 alpha numeric
ServiceVOIPDeviceAddEdit2 device = new ServiceVOIPDeviceAddEdit2(); // ServiceVOIPDeviceAddEdit2 | device fields
try {
    ServiceDocsDeviceGetSingle result = apiInstance.v1AccountAccountidDeviceDeviceidPut(accountid, deviceid, device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDeviceDeviceidPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceid** | **String**| Device ID, 32 alpha numeric | [default to null]
 **device** | [**ServiceVOIPDeviceAddEdit2**](ServiceVOIPDeviceAddEdit2.md)| device fields |

### Return type

[**ServiceDocsDeviceGetSingle**](ServiceDocsDeviceGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidDeviceDeviceidRebootPost

> ServiceDocsDeviceReboot v1AccountAccountidDeviceDeviceidRebootPost(accountid, deviceid)

Reboot Device

Reboot a device in an account to mitigate malware and improve device performance.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String deviceid = null; // String | Device ID, 32 alpha numeric
try {
    ServiceDocsDeviceReboot result = apiInstance.v1AccountAccountidDeviceDeviceidRebootPost(accountid, deviceid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDeviceDeviceidRebootPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **deviceid** | **String**| Device ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsDeviceReboot**](ServiceDocsDeviceReboot.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDeviceGet

> ServiceDocsDeviceGetAll v1AccountAccountidDeviceGet(accountid, startKey, pageSize)

Get Device List

Obtain a list of all devices associated with an account such as fax machines, cell phones, and soft phones.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsDeviceGetAll result = apiInstance.v1AccountAccountidDeviceGet(accountid, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDeviceGet");
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

[**ServiceDocsDeviceGetAll**](ServiceDocsDeviceGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDevicePost

> ServiceDocsDeviceGetSingle v1AccountAccountidDevicePost(accountid, device)

Create Device

Connect a new device to an account to enhance communication methods.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceVOIPDeviceAddEdit2 device = new ServiceVOIPDeviceAddEdit2(); // ServiceVOIPDeviceAddEdit2 | device fields
try {
    ServiceDocsDeviceGetSingle result = apiInstance.v1AccountAccountidDevicePost(accountid, device);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDevicePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **device** | [**ServiceVOIPDeviceAddEdit2**](ServiceVOIPDeviceAddEdit2.md)| device fields |

### Return type

[**ServiceDocsDeviceGetSingle**](ServiceDocsDeviceGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidDeviceStatusGet

> ServiceDocsDeviceStatus v1AccountAccountidDeviceStatusGet(accountid)

Get Device Status

Retrieve a device’s status (e.g., registered or not registered) in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeviceApi;

DeviceApi apiInstance = new DeviceApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsDeviceStatus result = apiInstance.v1AccountAccountidDeviceStatusGet(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceApi#v1AccountAccountidDeviceStatusGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsDeviceStatus**](ServiceDocsDeviceStatus.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

