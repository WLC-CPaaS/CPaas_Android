# ProvisioningApi

All URIs are relative to *http://API_HOSTNAME*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ApBrandBrandFamilyFamilyGet**](ProvisioningApi.md#v1ApBrandBrandFamilyFamilyGet) | **GET** /v1/ap/brand/{brand}/family/{family} | Get Family
[**v1ApBrandBrandFamilyFamilyModelGet**](ProvisioningApi.md#v1ApBrandBrandFamilyFamilyModelGet) | **GET** /v1/ap/brand/{brand}/family/{family}/model | Get Model List
[**v1ApBrandBrandFamilyFamilyModelModelGet**](ProvisioningApi.md#v1ApBrandBrandFamilyFamilyModelModelGet) | **GET** /v1/ap/brand/{brand}/family/{family}/model/{model} | Get Model
[**v1ApBrandBrandFamilyFamilyModelModelTemplateGet**](ProvisioningApi.md#v1ApBrandBrandFamilyFamilyModelModelTemplateGet) | **GET** /v1/ap/brand/{brand}/family/{family}/model/{model}/template | Get Template List
[**v1ApBrandBrandFamilyFamilyModelModelTemplateTemplateGet**](ProvisioningApi.md#v1ApBrandBrandFamilyFamilyModelModelTemplateTemplateGet) | **GET** /v1/ap/brand/{brand}/family/{family}/model/{model}/template/{template} | Get Template
[**v1ApBrandBrandFamilyGet**](ProvisioningApi.md#v1ApBrandBrandFamilyGet) | **GET** /v1/ap/brand/{brand}/family | Get Family List
[**v1ApBrandBrandGet**](ProvisioningApi.md#v1ApBrandBrandGet) | **GET** /v1/ap/brand/{brand} | Get Brand
[**v1ApBrandGet**](ProvisioningApi.md#v1ApBrandGet) | **GET** /v1/ap/brand | Get Brand
[**v1ApConfigfileGeneratePost**](ProvisioningApi.md#v1ApConfigfileGeneratePost) | **POST** /v1/ap/configfile/generate | Generate config file



## v1ApBrandBrandFamilyFamilyGet

> ProvisioningDocsDocsFamilyOutputSingle v1ApBrandBrandFamilyFamilyGet(brand, family)

Get Family

Retrieve a family&#39;s details by the randomly generated ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand
String family = null; // String | family
try {
    ProvisioningDocsDocsFamilyOutputSingle result = apiInstance.v1ApBrandBrandFamilyFamilyGet(brand, family);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandFamilyFamilyGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand | [default to null]
 **family** | **String**| family | [default to null]

### Return type

[**ProvisioningDocsDocsFamilyOutputSingle**](ProvisioningDocsDocsFamilyOutputSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandBrandFamilyFamilyModelGet

> ProvisioningDocsDocsModelOutput v1ApBrandBrandFamilyFamilyModelGet(brand, family, modelName, pageSize, startKey, status)

Get Model List

Retrieve a list of all models within a family for a brand (e.g., Yealink and Polycom).

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand
String family = null; // String | family
String modelName = null; // String | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
String status = null; // String | 
try {
    ProvisioningDocsDocsModelOutput result = apiInstance.v1ApBrandBrandFamilyFamilyModelGet(brand, family, modelName, pageSize, startKey, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandFamilyFamilyModelGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand | [default to null]
 **family** | **String**| family | [default to null]
 **modelName** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **status** | **String**|  | [optional] [default to null] [enum: active, inactive]

### Return type

[**ProvisioningDocsDocsModelOutput**](ProvisioningDocsDocsModelOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandBrandFamilyFamilyModelModelGet

> ProvisioningDocsDocsModelOutputSingle v1ApBrandBrandFamilyFamilyModelModelGet(brand, family, model)

Get Model

Retrieve a model&#39;s details by the randomly generated ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand
String family = null; // String | family
String model = null; // String | model
try {
    ProvisioningDocsDocsModelOutputSingle result = apiInstance.v1ApBrandBrandFamilyFamilyModelModelGet(brand, family, model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandFamilyFamilyModelModelGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand | [default to null]
 **family** | **String**| family | [default to null]
 **model** | **String**| model | [default to null]

### Return type

[**ProvisioningDocsDocsModelOutputSingle**](ProvisioningDocsDocsModelOutputSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandBrandFamilyFamilyModelModelTemplateGet

> ProvisioningDocsDocsTemplatesOutput v1ApBrandBrandFamilyFamilyModelModelTemplateGet(brand, family, model, firmware, pageSize, startKey, status, templateName)

Get Template List

Retrieve a list of all templates for a model within a brand (e.g., Yealink and Polycom).

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand
String family = null; // String | family
String model = null; // String | model
String firmware = null; // String | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
String status = null; // String | 
String templateName = null; // String | 
try {
    ProvisioningDocsDocsTemplatesOutput result = apiInstance.v1ApBrandBrandFamilyFamilyModelModelTemplateGet(brand, family, model, firmware, pageSize, startKey, status, templateName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandFamilyFamilyModelModelTemplateGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand | [default to null]
 **family** | **String**| family | [default to null]
 **model** | **String**| model | [default to null]
 **firmware** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **status** | **String**|  | [optional] [default to null] [enum: active, inactive]
 **templateName** | **String**|  | [optional] [default to null]

### Return type

[**ProvisioningDocsDocsTemplatesOutput**](ProvisioningDocsDocsTemplatesOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandBrandFamilyFamilyModelModelTemplateTemplateGet

> ProvisioningDocsDocsTemplateOutputSingle v1ApBrandBrandFamilyFamilyModelModelTemplateTemplateGet(brand, family, model, template)

Get Template

Retrieve details about a template for a model by the randomly generated ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand
String family = null; // String | family
String model = null; // String | model
String template = null; // String | template
try {
    ProvisioningDocsDocsTemplateOutputSingle result = apiInstance.v1ApBrandBrandFamilyFamilyModelModelTemplateTemplateGet(brand, family, model, template);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandFamilyFamilyModelModelTemplateTemplateGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand | [default to null]
 **family** | **String**| family | [default to null]
 **model** | **String**| model | [default to null]
 **template** | **String**| template | [default to null]

### Return type

[**ProvisioningDocsDocsTemplateOutputSingle**](ProvisioningDocsDocsTemplateOutputSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandBrandFamilyGet

> ProvisioningDocsDocsFamilyOutput v1ApBrandBrandFamilyGet(brand, familyName, pageSize, startKey, status)

Get Family List

Retrieve a list of all families for a brand (e.g., Yealink and Polycom).

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand
String familyName = null; // String | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
String status = null; // String | 
try {
    ProvisioningDocsDocsFamilyOutput result = apiInstance.v1ApBrandBrandFamilyGet(brand, familyName, pageSize, startKey, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandFamilyGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand | [default to null]
 **familyName** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **status** | **String**|  | [optional] [default to null] [enum: active, inactive]

### Return type

[**ProvisioningDocsDocsFamilyOutput**](ProvisioningDocsDocsFamilyOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandBrandGet

> ProvisioningDocsDocsBrandOutputSingle v1ApBrandBrandGet(brand)

Get Brand

Retrieve a brand&#39;s details by the randomly generated ID.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brand = null; // String | brand id to retrieve a brand
try {
    ProvisioningDocsDocsBrandOutputSingle result = apiInstance.v1ApBrandBrandGet(brand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandBrandGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand** | **String**| brand id to retrieve a brand | [default to null]

### Return type

[**ProvisioningDocsDocsBrandOutputSingle**](ProvisioningDocsDocsBrandOutputSingle.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApBrandGet

> ProvisioningDocsDocsBrandsOutput v1ApBrandGet(brandName, pageSize, startKey, status)

Get Brand

Retrieve a list of all brands (e.g., Yealink and Polycom) by client.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
String brandName = null; // String | 
Integer pageSize = null; // Integer | 
String startKey = null; // String | 
String status = null; // String | 
try {
    ProvisioningDocsDocsBrandsOutput result = apiInstance.v1ApBrandGet(brandName, pageSize, startKey, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApBrandGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandName** | **String**|  | [optional] [default to null]
 **pageSize** | **Integer**|  | [optional] [default to null]
 **startKey** | **String**|  | [optional] [default to null]
 **status** | **String**|  | [optional] [default to null] [enum: active, inactive]

### Return type

[**ProvisioningDocsDocsBrandsOutput**](ProvisioningDocsDocsBrandsOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## v1ApConfigfileGeneratePost

> ProvisioningDocsDocsConfigFileOutput v1ApConfigfileGeneratePost(params)

Generate config file

Generate a configuration file that includes a list of parameters passed to the specified template_id in the request payload, with populated values returned in the response.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ProvisioningApi;

ProvisioningApi apiInstance = new ProvisioningApi();
ModelsGenerateConfigFileRequest params = new ModelsGenerateConfigFileRequest(); // ModelsGenerateConfigFileRequest | body params to generate config file
try {
    ProvisioningDocsDocsConfigFileOutput result = apiInstance.v1ApConfigfileGeneratePost(params);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningApi#v1ApConfigfileGeneratePost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **params** | [**ModelsGenerateConfigFileRequest**](ModelsGenerateConfigFileRequest.md)| body params to generate config file |

### Return type

[**ProvisioningDocsDocsConfigFileOutput**](ProvisioningDocsDocsConfigFileOutput.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

