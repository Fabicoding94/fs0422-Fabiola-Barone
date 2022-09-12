
export class Todo {
  public id: any;
  public title: string;
  public isCompleted: boolean;
  constructor(title: string, isCompleted: boolean){
    this.title = title;
    this.isCompleted = isCompleted;

  }
}
