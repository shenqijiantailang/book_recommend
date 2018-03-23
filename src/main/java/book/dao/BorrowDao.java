package book.dao;

import book.domain.dataobject.BorrowDO;

import java.util.List;

/**
 * @author yutong song
 * @date 2018/3/21
 */
public interface BorrowDao {

    long addBorrowRecord(BorrowDO borrowDO);

    List<BorrowDO>listByUserId(long userId);

    long updateBorrow(BorrowDO borrowDO);

    BorrowDO queryByBorrowId(long borrowId);

    List<BorrowDO> listAllBorrows();
}
