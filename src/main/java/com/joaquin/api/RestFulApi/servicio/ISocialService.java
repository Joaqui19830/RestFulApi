package com.joaquin.api.RestFulApi.servicio;


import com.joaquin.api.RestFulApi.models.Social;

import java.util.List;

public interface ISocialService {

    public List<Social> verSocial();



    public void deleteSocial(Long id);


    Social socialResponse(Social so);

    public void save(Social social);
}
