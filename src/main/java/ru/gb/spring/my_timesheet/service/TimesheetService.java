package ru.gb.spring.my_timesheet.service;

import org.springframework.stereotype.Service;
import ru.gb.spring.my_timesheet.model.Project;
import ru.gb.spring.my_timesheet.model.Timesheet;
import ru.gb.spring.my_timesheet.repository.ProjectRepository;
import ru.gb.spring.my_timesheet.repository.TimesheetRepository;

import java.util.List;
import java.util.Optional;

@Service // то же самое, что и Component, это больше метка для нас
public class TimesheetService {

    private final TimesheetRepository timesheetRepository;
    private final ProjectRepository projectRepository;

    public TimesheetService(TimesheetRepository timesheetRepository, ProjectRepository projectRepository) {
        this.timesheetRepository = timesheetRepository;
        this.projectRepository = projectRepository;
    }

    public Optional<Timesheet> getById(Long id) {
        return timesheetRepository.getById(id);
    }

    public List<Timesheet> getAll() {
        return timesheetRepository.getAll();
    }

    public Timesheet create(Timesheet timesheet) {
        return timesheetRepository.create(timesheet);
    }

    public void delete(Long id) {
        timesheetRepository.delete(id);
    }

    public Optional<Project> getProjectById(Long id){
        return projectRepository.getById(id);
    }

}