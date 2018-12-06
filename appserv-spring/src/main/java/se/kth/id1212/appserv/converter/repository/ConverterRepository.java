package se.kth.id1212.appserv.converter.repository;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import se.kth.id1212.appserv.converter.domain.Conversion;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
public interface ConverterRepository extends JpaRepository<Conversion, String> {

    Conversion findConversionByFromto(String fromto);

//    @Modifying
//    @Query(value = "insert into CONVERSION (CON_FROMTO,CON_RATE) VALUES (?,?)", nativeQuery = true)
//    void insert(String fromto, double rate);
}
