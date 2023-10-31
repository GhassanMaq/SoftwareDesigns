# SoftwareDesigns
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

