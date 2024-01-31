import 'package:flutter/material.dart';
import 'task.dart';
import 'task_details_page.dart';

class TaskDetailsPage extends StatelessWidget {
  final Task task;

  TaskDetailsPage({required this.task});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(task.name),
      ),
      body: Column(
        crossAxisAlignment: CrossAxisAlignment.stretch,
        children: <Widget>[
          Text('Deadline: ${task.deadline}'),
          Text('Important: ${task.important ? 'Yes' : 'No'}'),
          Text('Done: ${task.done ? 'Yes' : 'No'}'),
          // Show buttons for editing and deleting task
        ],
      ),
    );
  }
}
