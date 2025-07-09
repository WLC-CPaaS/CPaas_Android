# SystemStatusApi

All URIs are relative to *http://api.beta.cpaaslabs.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ApPingGet**](SystemStatusApi.md#v1ApPingGet) | **GET** /v1/ap/ping | Provisioning Ping
[**v1PingGet**](SystemStatusApi.md#v1PingGet) | **GET** /v1/ping | Ping Backend
[**v1PingseccognitoGet**](SystemStatusApi.md#v1PingseccognitoGet) | **GET** /v1/pingseccognito | Ping Cognito
[**v1SystemStatusGet**](SystemStatusApi.md#v1SystemStatusGet) | **GET** /v1/system_status | Get System Status



## v1ApPingGet

> ProvisioningDocsDocsPingOutput v1ApPingGet()

Provisioning Ping

Ping the provisioning service.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SystemStatusApi;

SystemStatusApi apiInstance = new SystemStatusApi();
try {
    ProvisioningDocsDocsPingOutput result = apiInstance.v1ApPingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemStatusApi#v1ApPingGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ProvisioningDocsDocsPingOutput**](ProvisioningDocsDocsPingOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1PingGet

> ServiceDocsPingGet v1PingGet()

Ping Backend

Get the ping message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SystemStatusApi;

SystemStatusApi apiInstance = new SystemStatusApi();
try {
    ServiceDocsPingGet result = apiInstance.v1PingGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemStatusApi#v1PingGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceDocsPingGet**](ServiceDocsPingGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1PingseccognitoGet

> ServiceDocsPingGet v1PingseccognitoGet()

Ping Cognito

Get a secure ping message.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SystemStatusApi;

SystemStatusApi apiInstance = new SystemStatusApi();
try {
    ServiceDocsPingGet result = apiInstance.v1PingseccognitoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemStatusApi#v1PingseccognitoGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceDocsPingGet**](ServiceDocsPingGet.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1SystemStatusGet

> ServiceDocsSystemStatusGetSingle v1SystemStatusGet()

Get System Status

Get the system status.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SystemStatusApi;

SystemStatusApi apiInstance = new SystemStatusApi();
try {
    ServiceDocsSystemStatusGetSingle result = apiInstance.v1SystemStatusGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemStatusApi#v1SystemStatusGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceDocsSystemStatusGetSingle**](ServiceDocsSystemStatusGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

