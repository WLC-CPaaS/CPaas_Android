# E911Api

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1E911Get**](E911Api.md#v1E911Get) | **GET** /v1/e911 | Get E911 List
[**v1E911LocationLocationIDActivatePut**](E911Api.md#v1E911LocationLocationIDActivatePut) | **PUT** /v1/e911/location/{locationID}/activate | Activate E911 Location
[**v1E911LocationLocationIDDelete**](E911Api.md#v1E911LocationLocationIDDelete) | **DELETE** /v1/e911/location/{locationID} | Delete E911 Location
[**v1E911LocationValidatePut**](E911Api.md#v1E911LocationValidatePut) | **PUT** /v1/e911/location/validate | Validate a Location
[**v1E911PhoneNumberDelete**](E911Api.md#v1E911PhoneNumberDelete) | **DELETE** /v1/e911/{phoneNumber} | Delete E911 Phone Number
[**v1E911PhoneNumberLocationActiveGet**](E911Api.md#v1E911PhoneNumberLocationActiveGet) | **GET** /v1/e911/{phoneNumber}/location/active | Get Actvie Location for a Phone Number
[**v1E911PhoneNumberLocationGet**](E911Api.md#v1E911PhoneNumberLocationGet) | **GET** /v1/e911/{phoneNumber}/location | Get Location List for Phone Number
[**v1E911Post**](E911Api.md#v1E911Post) | **POST** /v1/e911 | Create an E911 Location



## v1E911Get

> ServiceDocE911URIsApiOutput v1E911Get()

Get E911 List

Obtain e911 URIs associated with the provided account ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
try {
    ServiceDocE911URIsApiOutput result = apiInstance.v1E911Get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911Get");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ServiceDocE911URIsApiOutput**](ServiceDocE911URIsApiOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1E911LocationLocationIDActivatePut

> ServiceDocE911ActiveLocationOutput v1E911LocationLocationIDActivatePut(locationID)

Activate E911 Location

Edit the provision location.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
String locationID = null; // String | Location ID
try {
    ServiceDocE911ActiveLocationOutput result = apiInstance.v1E911LocationLocationIDActivatePut(locationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911LocationLocationIDActivatePut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationID** | **String**| Location ID | [default to null]

### Return type

[**ServiceDocE911ActiveLocationOutput**](ServiceDocE911ActiveLocationOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1E911LocationLocationIDDelete

> ServiceDocE911RemoveLocationOutput v1E911LocationLocationIDDelete(locationID)

Delete E911 Location

Remove the location.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
String locationID = null; // String | Location ID
try {
    ServiceDocE911RemoveLocationOutput result = apiInstance.v1E911LocationLocationIDDelete(locationID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911LocationLocationIDDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationID** | **String**| Location ID | [default to null]

### Return type

[**ServiceDocE911RemoveLocationOutput**](ServiceDocE911RemoveLocationOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1E911LocationValidatePut

> ServiceDocE911ValidateLocationOutput v1E911LocationValidatePut(reqBody)

Validate a Location

Validate the location details.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
ServiceE911ValidateLocationInput reqBody = new ServiceE911ValidateLocationInput(); // ServiceE911ValidateLocationInput | location details
try {
    ServiceDocE911ValidateLocationOutput result = apiInstance.v1E911LocationValidatePut(reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911LocationValidatePut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqBody** | [**ServiceE911ValidateLocationInput**](ServiceE911ValidateLocationInput.md)| location details |

### Return type

[**ServiceDocE911ValidateLocationOutput**](ServiceDocE911ValidateLocationOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## v1E911PhoneNumberDelete

> ServiceDocE911RemoveURIApiOutput v1E911PhoneNumberDelete(phoneNumber)

Delete E911 Phone Number

Delete the e911 URI connected with the account URI.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
String phoneNumber = null; // String | Phone Number
try {
    ServiceDocE911RemoveURIApiOutput result = apiInstance.v1E911PhoneNumberDelete(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911PhoneNumberDelete");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| Phone Number | [default to null]

### Return type

[**ServiceDocE911RemoveURIApiOutput**](ServiceDocE911RemoveURIApiOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1E911PhoneNumberLocationActiveGet

> ServiceDocE911ActiveLocationURIApiOutput v1E911PhoneNumberLocationActiveGet(phoneNumber)

Get Actvie Location for a Phone Number

Get the e911 location connected with the URI.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
String phoneNumber = null; // String | Phone Number
try {
    ServiceDocE911ActiveLocationURIApiOutput result = apiInstance.v1E911PhoneNumberLocationActiveGet(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911PhoneNumberLocationActiveGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| Phone Number | [default to null]

### Return type

[**ServiceDocE911ActiveLocationURIApiOutput**](ServiceDocE911ActiveLocationURIApiOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1E911PhoneNumberLocationGet

> ServiceDocE911LocationsURIApiOutput v1E911PhoneNumberLocationGet(phoneNumber)

Get Location List for Phone Number

Access a list of the e911 locations associated with the provided URI.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
String phoneNumber = null; // String | Phone Number
try {
    ServiceDocE911LocationsURIApiOutput result = apiInstance.v1E911PhoneNumberLocationGet(phoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911PhoneNumberLocationGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumber** | **String**| Phone Number | [default to null]

### Return type

[**ServiceDocE911LocationsURIApiOutput**](ServiceDocE911LocationsURIApiOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1E911Post

> ServiceDocE911AddLocationOutput v1E911Post(reqBody)

Create an E911 Location

Enter new location details.

### Example

```java
// Import classes:
//import org.openapitools.client.api.E911Api;

E911Api apiInstance = new E911Api();
ServiceE911AddLocationInput reqBody = new ServiceE911AddLocationInput(); // ServiceE911AddLocationInput | location details
try {
    ServiceDocE911AddLocationOutput result = apiInstance.v1E911Post(reqBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling E911Api#v1E911Post");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reqBody** | [**ServiceE911AddLocationInput**](ServiceE911AddLocationInput.md)| location details |

### Return type

[**ServiceDocE911AddLocationOutput**](ServiceDocE911AddLocationOutput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

