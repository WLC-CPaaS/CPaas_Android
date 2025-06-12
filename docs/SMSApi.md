# SMSApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1SmsAccountAccountIDCampaignCampaignIDImportGet**](SMSApi.md#v1SmsAccountAccountIDCampaignCampaignIDImportGet) | **GET** /v1/sms/account/{accountID}/campaign/{campaignID}/import | 
[**v1SmsAccountAccountIDCampaignCampaignIDImportPost**](SMSApi.md#v1SmsAccountAccountIDCampaignCampaignIDImportPost) | **POST** /v1/sms/account/{accountID}/campaign/{campaignID}/import | 
[**v1SmsAccountAccountIDCampaignCampaignIDPhonenumberGet**](SMSApi.md#v1SmsAccountAccountIDCampaignCampaignIDPhonenumberGet) | **GET** /v1/sms/account/{accountID}/campaign/{campaignID}/phonenumber | 
[**v1SmsAccountAccountIDCampaignCampaignIDPhonenumberPut**](SMSApi.md#v1SmsAccountAccountIDCampaignCampaignIDPhonenumberPut) | **PUT** /v1/sms/account/{accountID}/campaign/{campaignID}/phonenumber | 
[**v1SmsAccountAccountIDCampaignImportGet**](SMSApi.md#v1SmsAccountAccountIDCampaignImportGet) | **GET** /v1/sms/account/{accountID}/campaign/import | 



## v1SmsAccountAccountIDCampaignCampaignIDImportGet

> ServiceDocsCampaignImportOutput v1SmsAccountAccountIDCampaignCampaignIDImportGet(accountID, campaignID)



Get details about a single imported campaign in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String campaignID = null; // String | Campaign ID
try {
    ServiceDocsCampaignImportOutput result = apiInstance.v1SmsAccountAccountIDCampaignCampaignIDImportGet(accountID, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#v1SmsAccountAccountIDCampaignCampaignIDImportGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **campaignID** | **String**| Campaign ID | [default to null]

### Return type

[**ServiceDocsCampaignImportOutput**](ServiceDocsCampaignImportOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1SmsAccountAccountIDCampaignCampaignIDImportPost

> ServiceDocsCampaignImportOutput v1SmsAccountAccountIDCampaignCampaignIDImportPost(accountID, campaignID)



Import campaign

### Example

```java
// Import classes:
//import org.openapitools.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String campaignID = null; // String | Campaign ID
try {
    ServiceDocsCampaignImportOutput result = apiInstance.v1SmsAccountAccountIDCampaignCampaignIDImportPost(accountID, campaignID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#v1SmsAccountAccountIDCampaignCampaignIDImportPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **campaignID** | **String**| Campaign ID | [default to null]

### Return type

[**ServiceDocsCampaignImportOutput**](ServiceDocsCampaignImportOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1SmsAccountAccountIDCampaignCampaignIDPhonenumberGet

> ServiceDocsCampaignPhoneNumberOutput v1SmsAccountAccountIDCampaignCampaignIDPhonenumberGet(accountID, campaignID, pageNum, pageSize)



Get telephone numbers associated with a campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String campaignID = null; // String | Campaign ID
BigDecimal pageNum = null; // BigDecimal | Page number
BigDecimal pageSize = null; // BigDecimal | Page size
try {
    ServiceDocsCampaignPhoneNumberOutput result = apiInstance.v1SmsAccountAccountIDCampaignCampaignIDPhonenumberGet(accountID, campaignID, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#v1SmsAccountAccountIDCampaignCampaignIDPhonenumberGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **campaignID** | **String**| Campaign ID | [default to null]
 **pageNum** | **BigDecimal**| Page number | [optional] [default to null]
 **pageSize** | **BigDecimal**| Page size | [optional] [default to null]

### Return type

[**ServiceDocsCampaignPhoneNumberOutput**](ServiceDocsCampaignPhoneNumberOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1SmsAccountAccountIDCampaignCampaignIDPhonenumberPut

> ServiceDocsCampaignTagDetagPhonenumbersOutput v1SmsAccountAccountIDCampaignCampaignIDPhonenumberPut(accountID, campaignID, reqBody)



Associate or dissociate telephone numbers with a campaign.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String accountID = null; // String | Account ID, 32 alpha numeric
String campaignID = null; // String | Campaign ID, 32 alpha numeric
ServiceCampaignTagDetagPhonenumbers reqBody = new ServiceCampaignTagDetagPhonenumbers(); // ServiceCampaignTagDetagPhonenumbers | payload fields
try {
    ServiceDocsCampaignTagDetagPhonenumbersOutput result = apiInstance.v1SmsAccountAccountIDCampaignCampaignIDPhonenumberPut(accountID, campaignID, reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#v1SmsAccountAccountIDCampaignCampaignIDPhonenumberPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **campaignID** | **String**| Campaign ID, 32 alpha numeric | [default to null]
 **reqBody** | [**ServiceCampaignTagDetagPhonenumbers**](ServiceCampaignTagDetagPhonenumbers.md)| payload fields |

### Return type

[**ServiceDocsCampaignTagDetagPhonenumbersOutput**](ServiceDocsCampaignTagDetagPhonenumbersOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1SmsAccountAccountIDCampaignImportGet

> ServiceDocsCampaignImportedGetAllOutput v1SmsAccountAccountIDCampaignImportGet(accountID, pageNum, pageSize)



Get a list of all imported campaigns in an account.

### Example

```java
// Import classes:
//import org.openapitools.client.api.SMSApi;

SMSApi apiInstance = new SMSApi();
String accountID = null; // String | Account ID, 32 alpha numeric
BigDecimal pageNum = null; // BigDecimal | Page number
BigDecimal pageSize = null; // BigDecimal | Page size
try {
    ServiceDocsCampaignImportedGetAllOutput result = apiInstance.v1SmsAccountAccountIDCampaignImportGet(accountID, pageNum, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SMSApi#v1SmsAccountAccountIDCampaignImportGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountID** | **String**| Account ID, 32 alpha numeric | [default to null]
 **pageNum** | **BigDecimal**| Page number | [optional] [default to null]
 **pageSize** | **BigDecimal**| Page size | [optional] [default to null]

### Return type

[**ServiceDocsCampaignImportedGetAllOutput**](ServiceDocsCampaignImportedGetAllOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

