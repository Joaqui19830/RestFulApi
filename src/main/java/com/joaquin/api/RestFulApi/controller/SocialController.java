package com.joaquin.api.RestFulApi.controller;


import com.joaquin.api.RestFulApi.models.Response;
import com.joaquin.api.RestFulApi.models.Social;
import com.joaquin.api.RestFulApi.servicio.ISocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SocialController {

    @Autowired
    ISocialService iSocialService;

    @GetMapping("/ver/social")
    @ResponseBody
    public List<Social> verSocial() {
        return iSocialService.verSocial();
    }

    @PostMapping("/new/social")
    public Response<Social> socialResponse(@RequestBody Social so) {

        Social soc = iSocialService.socialResponse(so);

        if (so != null) {
            iSocialService.save(so);
            return new Response<Social>(true, "Nuevo nombre social agregado", so);

        }
        return new Response<Social>(true, "Titulo o id no coinciden", null);
    }

    @DeleteMapping("/social/delete/{id}")
    public String deleteSocial(@PathVariable Long id) {
       iSocialService.deleteSocial(id);
        return "La social fue borrada";
    }
}
