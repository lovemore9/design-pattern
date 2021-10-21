package com.learn.design.principle.behavioral.command;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-21 9:43
 * </pre>
 */
@Slf4j
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
