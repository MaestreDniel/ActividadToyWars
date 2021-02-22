package Controler;

@RestController

public class ApiRest {
    @GetMapping("/Rest/Do")
    public Actions getCurrentActions(@RequestParam(value = "Actions", String Actions){
        return new Actions(getCurrentActions().JSON )
    }

@GetMapping ("/Rest/getCurrentStatus ")
public Status getCurrentStatus(@RequestParam(value=Status),String, Status){
    return getCurrentStatus();
}
@GetMapping("rest/render")
public Render(RenderType.JSON){
    return RenderType;
}

@GetMapping ("rest/new")
public lifeBeing lifeBeing (@RequestParam value="Pokemon"){
    return LifeBeing;
}

@GetMapping("rest/Get/Actions")
    public UserActipm (@RequestParam valuue=getCurrentactions){
        return;Iactions;
    }

}