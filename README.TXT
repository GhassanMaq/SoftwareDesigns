                             +---------------------+
                             |      User           |
                             +---------------------+
                             |- ID: int            |
                             |- name: String       |
                             |- age: int           |
                             |- hourlyRate: double |
                             |- completedHours: int|
                             |+ getSalary(): double|
                             +---------------------+
                                      ^
                                      |
                 +--------------------+--------------------+
                 |                    |                    |
       +---------v---------+   +------v-------+    +-------v-------+
       |      Staff       |   |    Manager   |    |    Director   |
       +------------------+   +--------------+    +---------------+
                            |- staffs: List<Staff>|  |- managers: List<Manager>|
                            |                     |  |- staffs: List<Staff>    |
                            +---------------------+  +-------------------------+

 +---------------------+         +----------------------+
 |  ReportGenerator    |<-------| StaffReportGenerator  |
 +---------------------+         +----------------------+
 |- generateReport(): String|   |                      |
 +---------------------+         +----------------------+

                             +----------------------+
                             | BudgetReportGenerator|
                             +----------------------+
                             |                      |
                             +----------------------+

          +--------------+    +-------------------+
          |   FakeDB     |<---| ConnectionManager |
          +--------------+    +-------------------+
          |- isConnected: bool|
          |+ getInstance(): FakeDB|
          |+ connect(): void    |
          |+ disconnect(): void |
          +---------------------+

User: the base class, representing a user.
Staff: represents a a staff member, extends a user.
Manager: represents a manager, has a list of staffs, extending a user.
Director: represents a director, has a list of staffs, and a list of manager, extending a user.
ReportGenerator: An interface defining report generator.
StaffReportGenerator: implements "ReportGenerator", provides a staff report.
BudgetReportGenerator: implements "ReportGenerator", provides a report of budget.

Single Responibilty Principle:
Each class has a single resposibilty.

Open Closed Principle:
The system is designed to be open for extension and closed for modification. The "ReportGenerator" interface allows for extension and adding new Reports without modifying other reports.

Interface Segeration Principle:
The system ensures that no client should be forced to depend on interfaces id does not use. Any class implementing the interface "ReportGenerator" needs to provide the logic for the  "generateReport()" method.

Singleton Principle:
The Signleton ensures that a class only has one instance. Our fakeDB uses this pattern to simulate a database connection. by ensuring only one connection open for each user.
