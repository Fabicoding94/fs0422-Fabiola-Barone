export class Posts{
  id:number | undefined
  title: string
  body: string
  active: boolean

  constructor(title:string, body:string, active:boolean){
      this.title = title
      this.body = body
      this.active = active
  }
}
