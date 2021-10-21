package gagana.suresh;

import org.springframework.web.bind.annotation.*;

@RestController
public class studentcontroller {
    @RequestMapping(value = "/xyz")
    public student getdata(){
        return new student("gagana", " Suresh");
    }
    @GetMapping("{fname}/{lname}")
    public student collectdata(@PathVariable("fname") String fname,@PathVariable("lname") String lname){
        return new student("Inchan", "gurudev");
    }
    @GetMapping("/student/query")
    public student collectdata2(@RequestParam(name ="fname") String fname, @RequestParam(name="lname") String lname){
        return  new student(fname,lname);
    }



}
