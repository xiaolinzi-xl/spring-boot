package com.imooc.service;

import com.imooc.domain.Girl;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.GirlException;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiaolinzi on 2017/11/8.
 */

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("D");
        girlA.setAge(13);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("Bcccceggdfff");
        girlB.setAge(12);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();

        if (age < 10){
//    返回你还在上小学
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16){
//            返回你还在上初中
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
