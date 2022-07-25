package com.project.TGDD.Service;

import com.project.TGDD.Model.Color;

import java.util.List;

public interface ColorService {
    List<Color> getAllColor();
    void addColor(Color color);
}
