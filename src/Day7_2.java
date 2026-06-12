
public class Day7_2 {
    static class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason){
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving request");
        }
        void reject() {
            System.out.println("Reject request");
        }
    }

    static class LeaveRequest extends Request {
        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        // Properly overriding the parent behavior
        @Override
        void approve() {
            System.out.println("Approving leave request");
        }

        @Override
        void reject() {
            System.out.println("Reject leave request");
        }
    }

    static class OnDutyRequest extends Request {
        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        // Properly overriding the parent behavior
        @Override
        void approve() {
            System.out.println("Approving on duty request");
        }

        @Override
        void reject() {
            System.out.println("Reject on duty request");
        }
    }

    // Fixed main method signature

        // You can now safely declare them using Polymorphism (Parent type)
        Request leaveRequest = new LeaveRequest("yalini", "12-06-2026", "health issues");
        leaveRequest.reject(); // Dynamically calls the LeaveRequest version

        Request onDutyRequest = new OnDutyRequest("yalini", "17-06-2026", "NCC camp");
        onDutyRequest.approve(); // Dynamically calls the OnDutyRequest version
    }

