import 'package:flutter/material.dart';
import 'task.dart';

class TaskListPage extends StatefulWidget {
  @override
  _TaskListPageState createState() => _TaskListPageState();
}

class _TaskListPageState extends State<TaskListPage> {
  List<Task> _tasks = [
    Task(name: 'Task 1', deadline: DateTime.now(), important: true, done: false),
    Task(name: 'Task 2', deadline: DateTime.now(), important: false, done: true),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Task List Details'),
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          Expanded(
            child: ListView.builder(
              itemCount: _tasks.length,
              itemBuilder: (context, index) {
                return ListTile(
                  title: Text(_tasks[index].name),
                  subtitle: Text('Deadline: ${_tasks[index].deadline}'),
                  trailing: _tasks[index].important ? Icon(Icons.star) : null,
                  onTap: () {
                    Navigator.push(
                      context,
                      MaterialPageRoute(builder: (context) => TaskDetailsPage(task: _tasks[index])),
                    );
                  },
                );
              },
            ),
          ),
          ElevatedButton(
            onPressed: () {
              // Add new task
            },
            child: Text('Add New Task'),
          ),
          ElevatedButton(
            onPressed: () {
              // Delete selected tasks
            },
            child: Text('Delete Selected Tasks'),
          ),
        ],
      ),
    );
  }
}
