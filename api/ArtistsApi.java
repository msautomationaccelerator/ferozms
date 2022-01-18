/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.amzn.ms.api;

import com.amzn.ms.model.Artist;
import com.amzn.ms.model.InlineResponse200;
import com.amzn.ms.model.InlineResponse400;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-18T11:26:47.365079+05:30[Asia/Kolkata]")
@Validated
@Api(value = "artists", description = "the artists API")
public interface ArtistsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /artists
     * Returns a list of artists
     *
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the artists to be displayed (optional)
     * @return Successfully returned a list of artists (status code 200)
     *         or Invalid request (status code 400)
     */

    @ApiOperation(value = "", nickname = "artistsGET", notes = "Returns a list of artists", response = Artist.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BasicAuth")
         }, tags={  })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "Successfully returned a list of artists", response = Artist.class, responseContainer = "List"),

        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/artists",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Artist>> artistsGET(@ApiParam(value = "Limits the number of items on a page") @Valid @RequestParam(value = "limit", required = false) Integer limit

,@ApiParam(value = "Specifies the page number of the artists to be displayed") @Valid @RequestParam(value = "offset", required = false) Integer offset

) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"artist_name\" : \"amit\", \"albums_recorded\" : 0, \"artist_genre\" : \"Rock\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /artists
     * Lets a user post a new artist
     *
     * @param artist  (required)
     * @return Successfully created a new artist (status code 200)
     *         or Invalid request (status code 400)
     */

    @ApiOperation(value = "", nickname = "artistsPOST", notes = "Lets a user post a new artist", authorizations = {
        
        @Authorization(value = "BasicAuth")
         }, tags={  })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "Successfully created a new artist"),

        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/artists",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> artistsPOST(

@ApiParam(value = "", required = true )   @Valid @RequestBody Artist artist) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /artists/{username}
     * Obtain information about an artist from his or her unique username
     *
     * @param username  (required)
     * @return Successfully returned an artist (status code 200)
     *         or Invalid request (status code 400)
     */

    @ApiOperation(value = "", nickname = "artistsUsernameGET", notes = "Obtain information about an artist from his or her unique username", response = InlineResponse200.class, authorizations = {
        
        @Authorization(value = "BasicAuth")
         }, tags={  })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "Successfully returned an artist", response = InlineResponse200.class),

        @ApiResponse(code = 400, message = "Invalid request", response = InlineResponse400.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/artists/{username}",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> artistsUsernameGET(@ApiParam(value = "", required = true) @PathVariable("username") String username

) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"artist_name\" : \"artist_name\", \"albums_recorded\" : 0, \"artist_genre\" : \"artist_genre\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}