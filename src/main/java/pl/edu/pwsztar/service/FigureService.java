package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.FigureMoveDto;

public interface FigureService {
    boolean checkCorrectMove(FigureMoveDto figureMoveDto);
}

