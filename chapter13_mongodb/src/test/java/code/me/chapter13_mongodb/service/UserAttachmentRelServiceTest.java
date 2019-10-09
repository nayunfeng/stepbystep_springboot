package code.me.chapter13_mongodb.service;

import code.me.chapter13_mongodb.domain.UserAttachmentRel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAttachmentRelServiceTest {

    @Autowired
    private UserAttachmentRelService userAttachmentRelService;

    @Test
    public void save() {
        UserAttachmentRel userAttachmentRel = new UserAttachmentRel();
        userAttachmentRel.setId("1");
        userAttachmentRel.setUserId("1");
        userAttachmentRel.setFilename("个人简历.doc");
        userAttachmentRelService.save(userAttachmentRel);
    }

    @Test
    public void findAll() {
        List<UserAttachmentRel> list = userAttachmentRelService.findAll();
        System.out.println(list);
    }
}