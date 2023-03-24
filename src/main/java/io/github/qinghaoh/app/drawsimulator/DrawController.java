package io.github.qinghaoh.app.drawsimulator;

import io.github.qinghaoh.app.drawsimulator.competition.Competition;
import io.github.qinghaoh.app.drawsimulator.competition.Round;
import io.github.qinghaoh.app.drawsimulator.competition.UCL;
import io.github.qinghaoh.app.drawsimulator.draw.Draw;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrawController {

    @GetMapping("/")
    public String index() {
        Competition competition = new UCL();
        Draw draw = new Draw(competition, 2019);
        return draw.start(Round.GROUP);
    }
}
