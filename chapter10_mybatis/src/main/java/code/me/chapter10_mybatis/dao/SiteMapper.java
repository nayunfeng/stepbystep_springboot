package code.me.chapter10_mybatis.dao;

import code.me.chapter10_mybatis.domain.Site;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/9/21 11:20
 * @description
 */
@Repository
public interface SiteMapper {

    List<Site> findAll();
}
