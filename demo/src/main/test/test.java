import jpa.customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class test {

    @Test
    public void test(){
        //实体管理工厂
        EntityManagerFactory myjpa = Persistence.createEntityManagerFactory("myjpa");
        //实体管理对象
        EntityManager entityManager = myjpa.createEntityManager();
        //事务
        EntityTransaction tx = entityManager.getTransaction();
        //开启事务
        tx.begin();
        customer customer = new customer();
        customer.setCustAddress("sx");
        customer.setCustName("jd");
        entityManager.persist(customer);
        //提交事务
        tx.commit();
        //释放资源
        entityManager.close();
        myjpa.close();
    }
}
