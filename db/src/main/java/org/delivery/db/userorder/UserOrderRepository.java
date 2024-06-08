package org.delivery.db.userorder;

import org.delivery.db.userorder.enums.UserOrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserOrderRepository extends JpaRepository<UserOrderEntity , Long> {


    // 특정 유저의 모든 쥬뮨
    // select * from user_order where user_id = ? and status = ? order by id desc
    List<UserOrderEntity> findAllByUserIdAndStatusByIdDesc(Long userId , UserOrderStatus status);

    List<UserOrderEntity> findAllByUserIdAndStatusInByIdDesc(Long userId ,List<UserOrderStatus> status);

    // 특정 주문
    // select * from user_order where id = ? and status = ? and user_id = ?
    Optional<UserOrderEntity> findByAllByIdAndStatusAndUserId(Long id , UserOrderStatus status , Long userId);
}
