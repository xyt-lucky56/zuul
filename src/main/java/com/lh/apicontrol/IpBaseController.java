package com.lh.apicontrol;

import com.lh.service.IpService;
import com.lh.unit.RedisOperator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 梁昊
 * @create 2019-05-03 13:53
 * @function
 * @editLog
 */
@EnableEurekaClient
@RestController
@RequestMapping("/api")
@Api(value = "得到域名、白名单、黑名单", description = "得到域名、白名单、黑名单粒子层")
public class IpBaseController {

//    @Autowired
//    IpService ipService;
//
//    @Autowired
//    RedisOperator redisOperator;
//    /**
//     * 得到域名
//     *
//     * @return 返回列表
//     */
//    @ApiOperation(value = "得到域名", notes = "返回列表")
//    @PostMapping("/testMongodb")
//    public boolean testMongodb(){
//        return ipService.testMongodb();
//    }
//
//
//    /**
//     * 得到域名
//     *
//     * @return 返回列表
//     */
//    @ApiOperation(value = "得到域名", notes = "返回列表")
//    @PostMapping("/getDomainList")
//    public List<String> getDomainList(){
//        List<String> domainList = redisOperator.getDomainList();
//        if (domainList == null || domainList.isEmpty()) {
//            return ipService.getDomainList();
//        }
//        else
//            return domainList;
//    }
//
//    /**
//     * 白名单
//     *
//     * @return 返回列表
//     */
//    @ApiOperation(value = "白名单", notes = "返回列表")
//    @PostMapping("/getWhiteList")
//    public List<String> getWhiteList(){
//        List<String> whiteList = redisOperator.getWhiteList();
//        if (whiteList == null || whiteList.isEmpty()) {
//            return ipService.getWhiteList();
//        }
//        else
//            return whiteList;
//    }
//
//    /**
//     * 黑名单
//     *
//     * @return 返回列表
//     */
//    @ApiOperation(value = "黑名单", notes = "返回列表")
//    @PostMapping("/getBlackList")
//    public List<String> getBlackList(){
//        List<String> blackList = redisOperator.getBlackList();
//        if (blackList == null || blackList.isEmpty()) {
//            return ipService.getBlackList();
//        }
//        else
//            return blackList;
//    }
//
//    /**
//     * 同步域名
//     *
//     * @return 已同步数量
//     */
//    @ApiOperation(value = "同步域名", notes = "已同步数量")
//    @PostMapping("/insertDomain")
//    public int insertDomain(){
//        return redisOperator.insertDomain(ipService.getDomainList());
//    }
//    /**
//     * 同步黑名单
//     *
//     * @return 已同步数量
//     */
//    @ApiOperation(value = "同步黑名单", notes = "已同步数量")
//    @PostMapping("/insertBlack")
//    public int insertBlack(){
//        return redisOperator.insertBlack(ipService.getBlackList());
//    }
//
//    /**
//     * 同步白名单
//     *
//     * @return 已同步数量
//     */
//    @ApiOperation(value = "同步白名单", notes = "已同步数量")
//    @PostMapping("/insertWhite")
//    public int insertWhite(){
//        return redisOperator.insertWhite(ipService.getWhiteList());
//    }
}
