import 'package:flutter/material.dart';

class LoginScreen extends StatefulWidget {
  @override
  _LoginScreenState createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final _formKey = GlobalKey<FormState>();
  bool _obscureText = true;
  late String _username;
  late String _password;

  void _togglePasswordVisibility() {
    setState(() {
      _obscureText = !_obscureText;
    });
  }

  void _submitForm() {
    if (_formKey.currentState!.validate()) {
      // Send data to backend using Java socket connection
      // If user is valid, proceed to main page
      // If user is invalid, show appropriate error message

      // Placeholder for sending data to backend
      print('Sending data to Java backend...');
      print('Username: $_username');
      print('Password: $_password');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Log In'),
      ),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.stretch,
            children: <Widget>[
              TextFormField(
                decoration: InputDecoration(labelText: 'Username or Email'),
                validator: (value) {
                  if (value!.isEmpty) {
                    return 'Please enter a username or email';
                  }
                  // Add additional validation for existing user
                  return null;
                },
                onSaved: (value) {
                  _username = value!;
                },
              ),
              SizedBox(height: 12.0),
              TextFormField(
                decoration: InputDecoration(
                  labelText: 'Password',
                  suffixIcon: IconButton(
                    icon: Icon(_obscureText ? Icons.visibility : Icons.visibility_off),
                    onPressed: _togglePasswordVisibility,
                  ),
                ),
                obscureText: _obscureText,
                validator: (value) {
                  if (value!.isEmpty) {
                    return 'Please enter a password';
                  }
                  return null;
                },
                onSaved: (value) {
                  _password = value!;
                },
              ),
              SizedBox(height: 24.0),
              ElevatedButton(
                onPressed: _submitForm,
                child: Text('Log In'),
              ),
              SizedBox(height: 12.0),
              TextButton(
                onPressed: () {
                  // Navigate to signup page
                  // Example:
                  // Navigator.push(
                  //   context,
                  //   MaterialPageRoute(builder: (context) => SignupScreen()),
                  // );
                },
                child: Text('Create an Account'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
