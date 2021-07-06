package com.in28minutes.soap.webservices.soapwebservicesmanagement.soap;

import com.in28minutes.courses.CourseDetails;
import com.in28minutes.courses.GetCourseDetailsRequest;
import com.in28minutes.courses.GetCourseDetailsResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CourseDetailsEndpoint {

    //method

    //input - GetCourseDetailsRequest

    //output - GetCourseDetailsResponse

    @PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse processAllCourseDetailsRequest
            (@RequestPayload GetCourseDetailsRequest request){

        GetCourseDetailsResponse response = new GetCourseDetailsResponse();

        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setId(request.getId());
        courseDetails.setName("Microservice Course");
        courseDetails.setDescription("You would learn the basics of Spring Framework");

        response.setCourseDetails(courseDetails);
        return response;
    }
}
