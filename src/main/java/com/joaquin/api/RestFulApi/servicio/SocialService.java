package com.joaquin.api.RestFulApi.servicio;


import com.joaquin.api.RestFulApi.models.Social;
import com.joaquin.api.RestFulApi.repositorio.SocialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService implements ISocialService {

    @Autowired
    SocialRepository socialRepository;


    @Override
    public List<Social> verSocial() {
        return socialRepository.findAll();
    }

    @Override
    public void deleteSocial(Long id) {
        socialRepository.deleteById(id);
    }



    @Override
    public Social socialResponse(Social so) {
        List<Social> listSoci =  socialRepository.findAll();
        for(Social soc: listSoci){
            if(soc.getNameSocial().equals(so.getNameSocial()) && soc.getImgSocial().equals(so.getImgSocial())){
                return soc;
            }
        }
        return null;
    }

    @Override
    public void save(Social social) {
        socialRepository.save(social);
    }
}
