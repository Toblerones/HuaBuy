/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.huabuy.controllers;

import com.huabuy.models.OrderInfo;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-06T22:01:07.491+10:00[Australia/Sydney]")

@Validated
@Api(value = "order", description = "the order API")
public interface OrderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /order/{customer}
     *
     * @param customer  (required)
     * @return true (status code 201)
     */
    @ApiOperation(value = "", nickname = "orderCustomerGet", notes = "", response = OrderInfo.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "true", response = OrderInfo.class) })
    @RequestMapping(value = "/order/{customer}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<OrderInfo> orderCustomerGet(@ApiParam(value = "", required = true) @PathVariable("customer") String customer) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : \"date\", \"orderItems\" : [ { \"ItemInfo\" : { \"item\" : \"item\", \"originalPrice\" : \"originalPrice\" } }, { \"ItemInfo\" : { \"item\" : \"item\", \"originalPrice\" : \"originalPrice\" } } ], \"customer\" : \"customer\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /order
     *
     * @param orderInfo create order (required)
     * @return true (status code 201)
     */
    @ApiOperation(value = "", nickname = "orderPost", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "true") })
    @RequestMapping(value = "/order",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> orderPost(@ApiParam(value = "create order", required = true) @Valid @RequestBody OrderInfo orderInfo) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
