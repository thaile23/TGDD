package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.Color;
import com.project.TGDD.Repository.ColorRepository;
import com.project.TGDD.Service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired ColorRepository colorRepository;
    @Override
    public List<Color> getAllColor() {
        List<Color> listColor = (List<Color>) colorRepository.findAll();
        return listColor;
    }

    @Override
    public void addColor(Color color) {
        colorRepository.save(color);
    }

}
