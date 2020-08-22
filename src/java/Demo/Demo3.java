package java.Demo;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/caller")
public class Demo3 {

    @GET
    @Path("/call")
    @Produces(MediaType.APPLICATION_JSON)
    public static void getCalls(){
        ArrayList<Call> callList = new ArrayList<Call>();
        Call call = new Call();
        call.setId("12345");
        call.setName("Long");
        call.setTime("10:20");
        callList.add(call);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public static void postCalls(){
        ArrayList<Call> callList = new ArrayList<Call>();
        System.out.println(callList.toString());
    }
}
