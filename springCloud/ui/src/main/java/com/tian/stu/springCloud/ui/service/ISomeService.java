package com.tian.stu.springCloud.ui.service;

import com.sun.media.jfxmedia.Media;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:TianZhenYu
 * @date:2018/5/14
 * @description:com.tian.stu.springCloud.ui.service stu
 */
@FeignClient("some")
public interface ISomeService {

    @RequestMapping(method = {RequestMethod.GET},
                    value = "/getSome",
                    produces = MediaType.APPLICATION_JSON_VALUE,
                    consumes = MediaType.APPLICATION_JSON_VALUE
                    )
    @ResponseBody
    public String getSome();
}
