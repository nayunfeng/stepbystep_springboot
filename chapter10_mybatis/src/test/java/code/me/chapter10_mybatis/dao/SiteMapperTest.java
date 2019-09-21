package code.me.chapter10_mybatis.dao;

import code.me.chapter10_mybatis.domain.Site;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/9/21 11:29
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SiteMapperTest {

    @Autowired
    private SiteMapper siteMapper;
    @Test
    public void findAll() {
        List<Site> siteList = siteMapper.findAll();
        System.out.println(siteList);
    }
}