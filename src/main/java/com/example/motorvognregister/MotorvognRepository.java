package com.example.motorvognregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorvognRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreMotorvogn(Motorvogn motorvogn) {
        String sql = "INSERT INTO Motorvogn (persNum, navn, adresse, kjennetegn, bilmerke, ) VALUES(?,?,?,?,?,?)";
        db.update(sql,motorvogn.getPersNum(),motorvogn.getNavn(), motorvogn.getAdresse(), motorvogn.getKjennetegn(), motorvogn.getBilmerke(), motorvogn.getBiltype());
    }

    public List<Motorvogn> hentAlleMotorvogner() {
        String sql = "SELECT * FROM Motorvogn";
        List<Motorvogn> alleMotorvogner = db.query(sql,new BeanPropertyRowMapper(Motorvogn.class));
        return alleMotorvogner;
    }

    public void slettAlleMotovogner () {
        String sql = "DELETE FROM Motorvogn";
        db.update(sql);
    }
}
