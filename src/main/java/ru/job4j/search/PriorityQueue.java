package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс описывает работу простейшей очереди по приоритету, которая работает
 * по принципу FIFO (first in - first out)
 * @author RUSLAN DAVYDOV
 * @version 1.0
 */

public class PriorityQueue {
    /**
     * Хранение задания осуществляется в коллекции типа LinkedList
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var i = 0;
        for (var element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            i++;
        }
        tasks.add(i, task);
    }

    /**
     * Метод позволяет получить первую задачу в очереди
     * @return возвращает задачу из головы очереди или null если очередь пуста
     */
    public Task take() {
        return this.tasks.poll();
    }
}
