public static void main() {
     class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason) {
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

        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }

        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }
    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }

        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }

        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }


        LeaveRequest leaveRequest = new LeaveRequest("yalini", "12-06-2026", "health issues");
        leaveRequest.rejectLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("yalini", "17-06-2026", "NCC camp");
        onDutyRequest.approveOnDutyRequest();

}
