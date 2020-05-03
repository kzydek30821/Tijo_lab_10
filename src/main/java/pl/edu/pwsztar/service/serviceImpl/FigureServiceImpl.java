package pl.edu.pwsztar.service.serviceImpl;

import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.service.FigureService;

@Service(value = "figureService")
public class FigureServiceImpl implements FigureService {

    @Override
    public boolean checkCorrectMove(FigureMoveDto figureMoveDto) {
        final char[] start = figureMoveDto.getStart().replace("_","").toCharArray();
        final char[] end = figureMoveDto.getDestination().replace("_","").toCharArray();
        return Math.abs(-end[0] + start[0]) == Math.abs(end[1] - start[1]);
    }
}
