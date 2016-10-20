/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.emailrenderertemplate.services

import uk.gov.hmrc.emailrenderertemplate.domain.Template
import uk.gov.hmrc.emailrenderertemplate.templates.sample1.Sample1Template
import uk.gov.hmrc.emailrenderertemplate.templates.sample2.Sample2Template

object TemplateLocator extends TemplateLocator {
  override val templates = Seq(Sample1Template, Sample2Template)
}
trait TemplateLocator {

  def templates: Seq[Template]

  def findTemplate(templateId: String) : Option[Template] = templates.find(_.templateId == templateId)
}