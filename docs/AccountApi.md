# AccountApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1AccountAccountidChildrenGet**](AccountApi.md#v1AccountAccountidChildrenGet) | **GET** /v1/account/{accountid}/children | Get Sub Account List
[**v1AccountAccountidDelete**](AccountApi.md#v1AccountAccountidDelete) | **DELETE** /v1/account/{accountid} | Delete Account
[**v1AccountAccountidDnsrecordGet**](AccountApi.md#v1AccountAccountidDnsrecordGet) | **GET** /v1/account/{accountid}/dnsrecord | Get Account DNS Record
[**v1AccountAccountidDnsrecordPost**](AccountApi.md#v1AccountAccountidDnsrecordPost) | **POST** /v1/account/{accountid}/dnsrecord | Create Account DNS Record
[**v1AccountAccountidDnsrecordPut**](AccountApi.md#v1AccountAccountidDnsrecordPut) | **PUT** /v1/account/{accountid}/dnsrecord | Convert Account DNS Record
[**v1AccountAccountidGet**](AccountApi.md#v1AccountAccountidGet) | **GET** /v1/account/{accountid} | Get Account Details
[**v1AccountAccountidLimitGet**](AccountApi.md#v1AccountAccountidLimitGet) | **GET** /v1/account/{accountid}/limit | Get Account Limits
[**v1AccountAccountidLimitPut**](AccountApi.md#v1AccountAccountidLimitPut) | **PUT** /v1/account/{accountid}/limit | Set Account Limits
[**v1AccountAccountidPost**](AccountApi.md#v1AccountAccountidPost) | **POST** /v1/account/{accountid} | Create Sub Account
[**v1AccountAccountidProvisioningdetailsGet**](AccountApi.md#v1AccountAccountidProvisioningdetailsGet) | **GET** /v1/account/{accountid}/provisioningdetails | Get Account Provisioning Details
[**v1AccountAccountidProvisioningdetailsResetpwPut**](AccountApi.md#v1AccountAccountidProvisioningdetailsResetpwPut) | **PUT** /v1/account/{accountid}/provisioningdetails/resetpw | Reset the provisioning details password.
[**v1AccountAccountidPut**](AccountApi.md#v1AccountAccountidPut) | **PUT** /v1/account/{accountid} | Update Account
[**v1AccountApikeyGet**](AccountApi.md#v1AccountApikeyGet) | **GET** /v1/account/apikey | 
[**v1AccountGet**](AccountApi.md#v1AccountGet) | **GET** /v1/account | Get Account List
[**v1AccountPost**](AccountApi.md#v1AccountPost) | **POST** /v1/account | Create Account



## v1AccountAccountidChildrenGet

> ServiceDocsAccountGetAll v1AccountAccountidChildrenGet(accountid, startKey, pageSize)

Get Sub Account List

Conveniently access the list of children accounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsAccountGetAll result = apiInstance.v1AccountAccountidChildrenGet(accountid, startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidChildrenGet");
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

[**ServiceDocsAccountGetAll**](ServiceDocsAccountGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDelete

> ServiceDocsAccountGetSingle v1AccountAccountidDelete(accountid)

Delete Account

Delete an account within your organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidDelete(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDnsrecordGet

> ServiceDocsAccountGetSingle v1AccountAccountidDnsrecordGet(accountid)

Get Account DNS Record

Get the DNS record of an account from the Route 53 entry.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidDnsrecordGet(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidDnsrecordGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDnsrecordPost

> ServiceDocsAccountGetSingle v1AccountAccountidDnsrecordPost(accountid)

Create Account DNS Record

Create the DNS record of an account with the help realm in the Route 53 entry.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidDnsrecordPost(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidDnsrecordPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidDnsrecordPut

> ServiceDocsAccountGetSingle v1AccountAccountidDnsrecordPut(accountid, dnsrecord)

Convert Account DNS Record

Toggle the realm DNS record between srv and cname.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceUpdateRecordTypeForAccount dnsrecord = new ServiceUpdateRecordTypeForAccount(); // ServiceUpdateRecordTypeForAccount | record type fields with value SRV, CNAME
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidDnsrecordPut(accountid, dnsrecord);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidDnsrecordPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **dnsrecord** | [**ServiceUpdateRecordTypeForAccount**](ServiceUpdateRecordTypeForAccount.md)| record type fields with value SRV, CNAME |

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidGet

> ServiceDocsAccountGetSingle v1AccountAccountidGet(accountid)

Get Account Details

This endpoint will not allow for modifying or making updates, it will only allow users to view/retrieve details.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidGet(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidLimitGet

> ServiceDocsAccountLimit v1AccountAccountidLimitGet(accountid)

Get Account Limits

Check the maximum number of inbound, outbound, and two-way trunks.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountLimit result = apiInstance.v1AccountAccountidLimitGet(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidLimitGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountLimit**](ServiceDocsAccountLimit.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidLimitPut

> ServiceDocsAccountLimit v1AccountAccountidLimitPut(accountid, limit)

Set Account Limits

Apply parameters to restrict access to inbound, outbound, and two-way trunks.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceVOIPAccountLimit2 limit = new ServiceVOIPAccountLimit2(); // ServiceVOIPAccountLimit2 | account fields
try {
    ServiceDocsAccountLimit result = apiInstance.v1AccountAccountidLimitPut(accountid, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidLimitPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **limit** | [**ServiceVOIPAccountLimit2**](ServiceVOIPAccountLimit2.md)| account fields |

### Return type

[**ServiceDocsAccountLimit**](ServiceDocsAccountLimit.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidPost

> ServiceDocsAccountGetSingle v1AccountAccountidPost(accountid, account)

Create Sub Account

Establish a sub account to enable an administrator within your organization to create accounts.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceVOIPAccountAddData account = new ServiceVOIPAccountAddData(); // ServiceVOIPAccountAddData | account fields
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidPost(accountid, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **account** | [**ServiceVOIPAccountAddData**](ServiceVOIPAccountAddData.md)| account fields |

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountAccountidProvisioningdetailsGet

> ServiceDocsAccountProvisioning v1AccountAccountidProvisioningdetailsGet(accountid)

Get Account Provisioning Details

Get the provisioning details of an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountProvisioning result = apiInstance.v1AccountAccountidProvisioningdetailsGet(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidProvisioningdetailsGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountProvisioning**](ServiceDocsAccountProvisioning.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidProvisioningdetailsResetpwPut

> ServiceDocsAccountProvisioning v1AccountAccountidProvisioningdetailsResetpwPut(accountid)

Reset the provisioning details password.

Reset the existing provisioning details password and set it to a new one.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
try {
    ServiceDocsAccountProvisioning result = apiInstance.v1AccountAccountidProvisioningdetailsResetpwPut(accountid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidProvisioningdetailsResetpwPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]

### Return type

[**ServiceDocsAccountProvisioning**](ServiceDocsAccountProvisioning.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountAccountidPut

> ServiceDocsAccountGetSingle v1AccountAccountidPut(accountid, account)

Update Account

Modify pertinent account data.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String accountid = null; // String | Account ID, 32 alpha numeric
ServiceVOIPAccountEditData account = new ServiceVOIPAccountEditData(); // ServiceVOIPAccountEditData | account fields
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountAccountidPut(accountid, account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountAccountidPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountid** | **String**| Account ID, 32 alpha numeric | [default to null]
 **account** | [**ServiceVOIPAccountEditData**](ServiceVOIPAccountEditData.md)| account fields |

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1AccountApikeyGet

> ServiceDocsAccountAPIKey v1AccountApikeyGet()



Authenticate an application or user request to get the client ID and client secret for a CPaaS account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
try {
    ServiceDocsAccountAPIKey result = apiInstance.v1AccountApikeyGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountApikeyGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceDocsAccountAPIKey**](ServiceDocsAccountAPIKey.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountGet

> ServiceDocsAccountGetAll v1AccountGet(startKey, pageSize)

Get Account List

Retrieve a list of all CPaaS accounts that exist within your organization.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
String startKey = null; // String | start_key for pagination that was returned as next_start_key from your previous call
Integer pageSize = null; // Integer | number of records to return, range 1 to 50
try {
    ServiceDocsAccountGetAll result = apiInstance.v1AccountGet(startKey, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startKey** | **String**| start_key for pagination that was returned as next_start_key from your previous call | [optional] [default to null]
 **pageSize** | **Integer**| number of records to return, range 1 to 50 | [optional] [default to null]

### Return type

[**ServiceDocsAccountGetAll**](ServiceDocsAccountGetAll.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1AccountPost

> ServiceDocsAccountGetSingle v1AccountPost(account)

Create Account

Create an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.AccountApi;

AccountApi apiInstance = new AccountApi();
ServiceVOIPAccountAddData account = new ServiceVOIPAccountAddData(); // ServiceVOIPAccountAddData | account fields
try {
    ServiceDocsAccountGetSingle result = apiInstance.v1AccountPost(account);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#v1AccountPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**ServiceVOIPAccountAddData**](ServiceVOIPAccountAddData.md)| account fields |

### Return type

[**ServiceDocsAccountGetSingle**](ServiceDocsAccountGetSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

