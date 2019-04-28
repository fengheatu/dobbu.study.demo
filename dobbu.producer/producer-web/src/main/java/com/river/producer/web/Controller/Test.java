package com.river.producer.web.Controller;

import com.river.model.Enum.ResEnum;
import com.river.model.dto.ResDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: fengheatu@163.com
 * @Date: 2019/4/27 21:45
 * @Description:
 */
@Controller
public class Test extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(Test.class);


    @RequestMapping("/")
    @ResponseBody
    public String test(){
        logger.info("dfjkl;asfjasfjdasljfasdlfjdaslfjdaslfjdaskfajds");
        ResDTO dto = new ResDTO();
        dto.setResEnum(ResEnum.SUCCESS);
        return object2Json(dto);
    }

}
