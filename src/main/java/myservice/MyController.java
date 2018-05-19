package myservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/opers")
public class MyController {

    @PostMapping(value = "{p1}/{p2}", consumes = "application/json")
    public String sum(
            @PathVariable(name = "p1") int a1,
            @PathVariable(name = "p2") int a2,
            @RequestParam(name = "p3") String e,
            @RequestParam(name = "p4", required = false) String s,
            @RequestBody DemoReqBody rb
    ){
        //return e + " и" + s + " = " + a1+a2;
        return String.format("%s и %s = %d%d %s",e,s,a1,a2, rb.toString());
    }

    @GetMapping(value = "{p1}")
    public double pow2(@PathVariable int p1){
        return Math.pow((double) 2,(double)p1);
    }

}
